package com.mobin.scala

/**
 * Created by Mobin on 2016/1/2.
 */
class ScalaExists {

}

object  ScalaExists extends  App{
  def containNeg(nums : List[Int]) = nums.exists(_ < 0)
  println(containNeg(List(1,1,6)))
}