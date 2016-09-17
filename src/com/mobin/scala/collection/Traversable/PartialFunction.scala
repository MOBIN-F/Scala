package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/17.
  * 利用偏函数筛选元素,筛选出偶数
  */
object PartialFunction {

  def main(args: Array[String]) {
    val t = Traversable(1,2,3,4,5,6,7,8,9,10)
    def filterEven: PartialFunction[Int, Int] = {
      case x if x % 2 == 0 => x
    }

    val result = t collect filterEven
    println(result)
  }
}
