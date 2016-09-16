package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/16.
  * 转置矩阵
  */
object Transpose {

  def main(args: Array[String]) {
    val matrix = Traversable(Traversable(1,2,3), Traversable(4,5,6), Traversable(7,8,9))
    println(matrix)

    val result = matrix.transpose
    println(result)
  }
}
