package com.mobin.scala.fpinScala

/**
  * Created by Mobin on 2016/6/3.
  */
object MyModule {

  def abs(n: Int): Int =
      if (n < 0) -n
      else n


  private def formatAbs(x: Int) = {
     val msg = "The absolute value of %d is %d"
     msg.format(x, abs(x))
  }

  //计算一个数的阶乘
  def factorial(n: Int) = {
     def go(n: Int, acc: Int): Int =
        if (n <= 0) acc
        else go(n - 1, n * acc)

       go(n, 1)
  }

  def main(args: Array[String]) {
    println(formatAbs(-42))
    println(factorial(7))
  }
}
