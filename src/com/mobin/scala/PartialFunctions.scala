package com.mobin.scala

/**
  * Created by Mobin on 2016/3/22.
  */
object PartialFunctions extends  App{

 val divide = new  PartialFunction[Int,Int] {
    def isDefinedAt(x: Int): Boolean = x != 0  //当x = 0时抛出异常

    def apply(x: Int): Int = 100/x
 }

  val divide1 : PartialFunction = {
    case  d : Int if d != 0 => 100/d
  }

  print(divide(0))
}
