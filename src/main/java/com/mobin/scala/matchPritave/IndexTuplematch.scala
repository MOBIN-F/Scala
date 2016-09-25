package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * 打印的同时其序号
  */
object IndexTuplematch {

  def main(args: Array[String]) {
    val itemCosts = Seq(("Alice",0.25),("mobin", 1.21))
    val itemCostsIndeices = itemCosts.zipWithIndex
    for(itemCostIndex <- itemCostsIndeices){
      itemCostIndex match {
        case ((item,cost),index) => println(s"$index:  $item cost $cost each")
      }
    }
  }
}
