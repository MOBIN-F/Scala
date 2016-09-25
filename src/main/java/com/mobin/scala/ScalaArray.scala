package com.mobin.scala

/**
 * Created by Mobin on 2015/11/2.
 */
class ScalaArray {

}

object  ScalaArray{
  def  main (args: Array[String]){
   /* val greetStrings = new Array[String](3)
    //val greetStrings : Array[String] = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!!"

    for(i <- 0 to 2)
      //0 to 2被转换成(0).to(2)
      print(greetStrings(i))*/

    val greetStrings = Array.apply("hello",",","world!!")
    for(i <- 0 to 2)
      print(greetStrings(i))

  }
}
