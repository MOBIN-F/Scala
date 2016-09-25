package com.mobin.scala.Scalaimplicit

/**
  * Created by Mobin on 2016/8/28.
  */


object ComplcatedSalesTaxDatamain {
  def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate

  object SimpleStateSlaesTax{
    implicit val rate: Float = 0.05F
  }

  case class ComplcatedSalesTaxData(
                                baseRate: Float,
                                isTaxHoliday: Boolean,
                                storeId: Int)

  object ComplicatedSalesTax{

    private def extraTaxRateForStore(id: Int): Float = {
      0.0F
    }

    implicit  def rate(implicit cstd: ComplcatedSalesTaxData): Float =
        if (cstd.isTaxHoliday) 0.0F
        else cstd.baseRate + extraTaxRateForStore(cstd.storeId)
  }

  def main(args: Array[String]) {
    import SimpleStateSlaesTax.rate
    val amount = 100F
    println(s"Tax on $amount = ${calcTax(amount)}")

    println("-------------------------------")

    import SimpleStateSlaesTax.rate
    implicit val myStore = ComplcatedSalesTaxData(0.06F, false, 1010)
    val amount1 = 100F
    println(s"Tax on $amount1 = ${calcTax(amount1)}")
  }

}
