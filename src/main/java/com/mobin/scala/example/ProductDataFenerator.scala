package com.mobin.scala.example

import java.io.FileWriter

import scala.util.Random

/**
  * Created by Mobin on 2016/10/22.
  */
object ProductDataFenerator {

  private val FILE_PATH = "CONSUMINTG_DATA"
  private val  MAX_RECORDS = 1000000;
  private val PRODUCT_ID_ARRAY = Array(1,2,3,4,5,6,7,8,9,10)
  private val MAX_PRICE = 2000
  private val MIN_PRIVCE = 10
  private val USERS_num = 1000000

  def main(args: Array[String]) {

  }

  private def generatorDataFile(filePath: String, recordNum: Int): Unit ={
    var writer: FileWriter = null
    try{
      writer = new FileWriter(filePath, true)
      val rand = new Random()
        for(i <- 1 to recordNum){
          var year = rand.nextInt(16) + 2000
          var month = rand.nextInt(12) + 1
          var day = rand.nextInt(28)  + 1
          var recordDate = year + "-" + month + "-" + day;
          var index:Int = rand.nextInt(PRODUCT_ID_ARRAY.length)
          var priductID = PRODUCT_ID_ARRAY(index)
          var price:Int = rand.nextInt(MAX_PRICE)
          if(price == 0){
            price = MIN_PRIVCE
          }
        }
    }catch {
      case e: Exception=>println("Error occurred " + e)
    }finally {
      if(writer != null) writer.close()
    }
  }
}
