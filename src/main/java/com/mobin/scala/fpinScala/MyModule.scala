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

  //高阶函数
  //参数f为一个函数，Int => Int为函数的参数类型，表示f接收一个整型参数并返回一个整型结果
  def formatResult(name : String,n : Int,f : Int => Int)={
      val msg = "The %s of %d is %d"
       msg.format(name,n,f(n))
  }

  def main(args: Array[String]) {
//    println(formatAbs(-42))
//    println(factorial(7))
    println(formatResult("absolute value",-42,abs))
    println(formatResult("factorial",7,factorial))
  }
}
