package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/21.
  * withFilter的结果类型为FilterMonadic，它只包含map,flatMap,foreach和withFilter操作，函数式编程有一个重要的概念叫作
  * 单子(Monad),它代表一种特殊的类型，这种类型是一个计算序列，可以让程序员使用管道的方式处理数据，withFilter与filter不同，
  * 调用withFilter只是返回FilterMonadic，可以继续调用withFilter，直到调用foreach才是真正的计算，而每次调用iflter都会进行
  * 计算，所以使用withFilter有一定的优势
  */
object WithFilter {

  def main(args: Array[String]) {
    val t= Traversable(1 to 10: _*)
    t withFilter(_<6) withFilter (_ > 2) withFilter (_ %2 ==0) foreach
    println
  }
}
