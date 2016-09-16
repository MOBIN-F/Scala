package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/16.
  * 1. 如果类型为Traversable的元素的类型不一致，则返回的类型为AnyVal
  * 2.集合的元素不能有的是普通 类型，有的是集合类型
  * 3.flatten函数是对集合元素进行浅平展，不进行深层次的平展
  * 4. flatten还能将元素中为none的值自动移除
  */
object ScalaFlatten {

  def main(args: Array[String]) {
    val s = Traversable(Traversable(1,2,3),Traversable(2,3,4),Traversable(5,6,7,8))
    val s1 = Traversable(Some(1),None,Some(3))

    println(s.flatten)
    println(s1.flatten)
  }
}
