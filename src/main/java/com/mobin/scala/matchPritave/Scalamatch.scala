package com.mobin.scala.m

/**
 * Created by Mobin on 2015/11/22.
 */
object  Scalamatch extends  App{
  val value = 1

  val result = value match {
    case 1 => "one"
    case 2 => "two"
    case _ => "onter number"
  }

  val result2 = value match {
    case i if i == 1 => "one"
    case i if i == 2 => "two"
    case _ => "other number"
  }

  def fun(obj : Any) = obj match {
    case x : Int => println("Int")
    case y : String => println("String")
    case _ => println("unknow type")


  }

  def longestWord(words : Array[String])={
    var word = words(0);
    var index = 0;
    for(i <- 1 until words.length) {
      if (words(i).length > word.length) {
        word = words(i)
        index = i
      }
    }
      ("220",2)
  }

  for{
    x <- Seq(1,2,2.7,"one","two","four")
  }{
    val str = x match {
      case 1                  => "int 1"
      case i : Int            => "OTHER INT" + i
      case d: Double    => "a double:"+ x
      case "one"           => "string one"
      case s: String       => "other string:" + s
      case unexpected => "unexpect" + x
    }
    println(str)
  }

println("-----------------------------------------变形")
  for{
    x <- Seq(1,2,2.7,"one","two","four")
  }{
    val str = x match {
      case 1                  => "int 1"
      case _ : Int            => "OTHER INT" + x
      case _: Double    => "a double:"+ x
      case "one"           => "string one"
      case _: String       => "other string:" + x
      case unexpected => "unexpect" + x
    }
    println(str)
  }

println("------------------------case子句支持“或”逻辑来避免代码的冗余")
  for{
    x <- Seq(1,2,2.7,"one","two","four")
  }{
    val str = x match {
      case 1                  => "int 1"
      case _ : Int  | _: Double          => "a munber" + x
      case "one"           => "string one"
      case _: String       =>  x
      case unexpected => "unexpect" + x
    }
    println(str)
  }

 // println(result)
 // println(result2)
 // fun("222")
}