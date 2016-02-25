package com.mobin.scala

/**
 * Created by Mobin on 2015/11/2.
 */
class SimplePractice {
}

object SimplePractice{
  def hello(name:String):String = {
     "Hello:" + name
  }

  def helloScala(){
  println("hi scala!")
  }

  def add = (x:Int,y:Int)=> x + y//匿名函数

  def main (args: Array[String]){
   // println(hello("Scala"))
    //helloScala()
    println(add(2,3))
  }
}
