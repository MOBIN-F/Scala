package com.mobin.scala.collection.Traversable

/**
  * Created by Mobin on 2016/9/22.
splitAt
根据位置将Traverable对象分成两部分，功能类似，但是更加有效
def splitAt(n: Int):(Traverable[A], Traverable[A])

span
span也是将Traverable对象分成两部分，它会一直选取元素，直到某个元素不满足断言，然后将前面的元素分成一组，将后面的元素分成另一组，共两部分
def span(p: (A) => Boolean): (Traverable[A], Traverable[A])

partiton
partition是将满足条件的元素和不满足条件的元素分成两部分，和span方法不同的是，span遇到某个元素不满足条件的时候就不再使用条件进行分割了，而partition则会对所有的元素进行条件判断，条件结果等于true的分为一组，等于false的分为另一组。分区返回一个(Traversable[A],Traversable[A]),第一个值是满足条件的元素的集合，第二个是不满足条件元素的集合
def partition(p: (A) => Boolean):(Traversable[A], Traversbale[A])

groupBy
groupBy按照条件将元素分组的，它根据提供的函数生成分组关键字
def groupby[K](f: (A) => K): Map[K, Traverable[A]]
  */
object Grouping {

  def main(args: Array[String]) {
    val t= Traversable(1 to 10: _*)

    println(t.splitAt(5))          //(List(1, 2, 3, 4, 5),List(6, 7, 8, 9, 10))
    println(t.span(_ < 6))      //(List(1, 2, 3, 4, 5),List(6, 7, 8, 9, 10)
    println(t.partition(_ % 2 ==0))   //(List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
    println(t.groupBy(_ % 3))    //Map(2 -> List(2, 5, 8), 1 -> List(1, 4, 7, 10), 0 -> List(3, 6, 9))
  }
}
