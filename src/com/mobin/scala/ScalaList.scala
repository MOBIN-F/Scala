package com.mobin.scala

/**
 * Created by Mobin on 2015/11/2.
 */
class ScalaList {

}

object  ScalaList{
  def main (args: Array[String] ) {
    //:::方法的使用
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(""+oneTwo+"and"+threeFour+" were not mutated.")
    println(oneTwoThreeFour+"is a new List")
    println("--------------::方法的使用-------------------------")
    //::方法的使用
    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
    //Nil方法的使用
    val threeTwoOne = 3 :: 2 :: 1 :: Nil
    println(threeTwoOne)
    //println(threeTwoOne(0))

  }
}
