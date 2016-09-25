package com.mobin.scala.fpinScala

/**
  * Created by Mobin on 2016/6/5.
  * 从一个数组中查找第一个匹配key的索引
  */
object FindFirst {
//A为类型参数，跟在函数名后使用中括号括起来，数组元素的类型为A，函数P接收两个类型参数为A的参数，一个参数为数元素，一个为key类型
  //key的类型必须为A，因为你不可能A实际参数为String，而key的类型被定义为Int
  def findFirst[A](as: Array[A], p: (A,A) => Boolean, key: A): Int = {
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n),key)) n
      else loop(n + 1)
    }
    loop(0)
  }

  def p(v : Int,key : Int): Boolean = {
       if(v == key)  true
      else false
  }




  def main(args: Array[String]) {
          val as = Array(1,2,3,4,5)
         val n = findFirst[Int](as,p,4)
         println(n)
  }
}
