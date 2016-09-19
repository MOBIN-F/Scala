package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/17.
  * 折叠元素(fold)
  * foldRight方法之前是通过递归的方式实现的，现在是通过foldLeft实现的
  * override def foldRight[B](z: B)(f: (A, B) => B): B =
  *           reverse.foldLeft(z)((right, left) => op(left, right))
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

    //求倒数第二个值
    def pen[A](t: Traversable[A]): A = t.foldLeft( (t.head, t.tail.head) )((r, c) => (r._2, c))._1
    println(pen(t))


  }
}
