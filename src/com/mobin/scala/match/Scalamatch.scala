package com.mobin.scala.match

/**
 * Created by Mobin on 2015/11/22.
 */
class Scalamatch {

}

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

  val person = ("mobin",12)



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

 // println(result)
 // println(result2)
  val w = longestWord("I am mobin".split(" "))
  print(w)
 // fun("222")
}