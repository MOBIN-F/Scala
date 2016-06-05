package com.mobin.scala.fpinScala

/**
  * Created by Mobin on 2016/6/5.
  * 判断数组是否按照order的顺序排序
  */
object SortTest {

  //升序
  def isSorted[A](as : Array[A],ordered : (A,A) => Boolean) : Boolean = {
    def sort(n : Int)  : Boolean= {
        if(n >= as.length-1)  true
        else if(ordered(as(n),as(n+1)))  false
        else sort(n +1)
    }
       sort(0)
  }

  def ordered(n : Int,m : Int): Boolean ={  //降序
      if(n >= m) true
      else false
  }

  def main(args: Array[String]) {
      val as = Array(1,2,3,4,0)
      val b = isSorted(as,ordered)
    println(b)
  }
}
