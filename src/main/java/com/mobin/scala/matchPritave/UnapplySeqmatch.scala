package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * 提取序列时返回非固定数量的元素
  */
object UnapplySeqmatch {

  def main(args: Array[String]) {
    val nonEmptyList = List(1,2,3,4)
    val emptyList = Nil
    val nonEmptyMap = Map("one" -> 1, "two" ->2, "three" -> 3)

    def windows[T](seq: Seq[T]): String = seq match {
      case Seq(head1, head2, _*) => s"($head1,$head2)" +  windows(seq.tail)
      case Seq(head, _*) => s"($head,_)" + windows(seq.tail)
      case Nil => "Nil"
    }

    /*更加优雅的写法
    def windows[T](seq: Seq[T]): String = seq match {
      case head1 +: head2 +: tail  => s"($head1,$head2)" +  windows(seq.tail)
      case head +: tail => s"($head,_)" + windows(seq.tail)
      case Nil => "Nil"
    }
    * */

    for(seq <- Seq(nonEmptyList,nonEmptyMap.toSeq, emptyList)){
        println(windows(seq))
    }
  }
}
