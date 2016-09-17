package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/17.
  * 折叠元素(fold)
  */
object Fold {

  def main(args: Array[String]) {
    val t = Traversable("A", "B", "C", "D")
    val result = t.fold("z")(_ + _)  //从左边往右开始计算，z + A + b + ...
    println(result)

    val result1 = t.foldRight("z")(_ + _)   //从右边往左开始计算  {z}， {D,z }，{C,D.z}
    println(result1)

    //以上两种方法的简写方式
    val result2 = t. /:("z")(_ + _)
    val result3 = t.:\ ("z")(_ + _)
    println(result2)
    println(result3)
  }
}
