package com.mobin.scala

/**
 * Created by Mobin on 2015/11/6.
 */
class ScalaFunction {

}

object  ScalaFunction{
  val add = (x : Int,y : Int) => x + y

  //String*表示接收可变参数
  def printEvertyChar(c : String*) = {
    c.foreach(x => print(x))
  }

  def formatArgs(args : Array[String]) = args.mkString("\n")

  val res = formatArgs(Array("I ","am ","mobin"))

  def main(args: Array[String]) {
     println(add(1,2))
    printEvertyChar("a","b","c")

    for(i <- 1 to 10 if i % 2 == 0){
      println(i)
    }


    println(res)

  }
}
