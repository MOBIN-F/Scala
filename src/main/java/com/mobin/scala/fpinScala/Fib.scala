package com.mobin.scala.fpinScala

/**
  * Created by Mobin on 2016/6/5.
  * 斐波那契数
  */
object Fib {

  def fib(n : Int) : Int = {
     if(n == 1 || n == 2)
         n-1
    else
       fib(n - 2) + fib(n - 1)
  }

  def main(args: Array[String]) {
     println(fib(6))
  }
}
