package com.mobin.scala

/**
  * Created by Mobin on 2016/3/22.
  */
object PartialFunctions extends  App{

 val divide = new  PartialFunction[Int,Int] {
    def isDefinedAt(x: Int): Boolean = x != 0  //当x = 0时抛出异常

    def apply(x: Int): Int = 100/x
 }

  val divide1 : PartialFunction[Int,Int] = {
    case  d : Int if d != 0 => 100/d
  }

  val rs : PartialFunction[Int , String] = {
      case 1 => "One"
      case 2 => "Two"
      case _ => "Other"
  }

  //OrElse的使用
 val or1 : PartialFunction[Int,String] = {case 1 => "One"}

 val or2 : PartialFunction[Int,String] = {case 2 => "Two"}

 val or_ : PartialFunction[Int,String] = {case _ => "Other"}

  val or = or1 orElse or2 orElse or_   //orElse的使用

  val at1 : PartialFunction[Int,String] = {case cs if cs == 1 => "One"}

 val at2  : PartialFunction[String,String] = {case cs if cs eq "One" => "The num is 1"}

  val a = at1 andThen at2   //andThen使用

    print(a(1))

}
