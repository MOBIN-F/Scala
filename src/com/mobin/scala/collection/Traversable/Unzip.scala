package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/17.
  * unzip接受一个隐式参数，这个隐式参数是一个类型转换：implict asPair: (A) => (A1, A2)
  */
object Unzip {

  def main(args: Array[String]) {
    val t = Traversable("a" -> 1, "b" -> 2, "c" -> 3)
    val (a, b) = t.unzip
    println(a)
    println(b)

    //显式的提供一个转换函数给unzip方法
    val t1 = Traversable("a_1", "b_2", "c_3")
    val (a1, b1) = t1.unzip(x => (x(0), x(2)))
    println(a1)
    println(b1)

   //定义一个隐式转换函数
    implicit  def asPair(x: String) = (x(0), x(2))
    val (a2, b2) = t1.unzip
    println(a2)
    println(b2)
  }
}
