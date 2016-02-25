package com.mobin.scala
import scala.collection.mutable.Map
/**
 * Created by Mobin on 2015/11/7.
 */
class ScalaMap {

}

object  ScalaMap{
  //可变map
  val map = Map[Int,String]()
  def main(args: Array[String]) {

    map += (1->"I ")
    map += (2->"am ")
    map += (3->"mobin.")
    println(map(1)+map(2)+map(3))

    //不可变Map
    val map1 = Map(1->"I ",2->"am ",3->"KPOP")
    println(map1(1)+map1(2)+map1(3))

  }
}
