package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * 序列的匹配
  */
object Seqmatch {
  def main(args: Array[String]) {
      val nonEmptySeq = Seq(1,2,3,4,5)
      val emptySeq = Seq.empty[Int]
      val nonEmptyList = List(1,2,3,4,5)
      val emptyList = Nil
      val nonEmptyVector = Vector(1,2,3,4,5,6)
      val nonEmptyMap = Map("one" -> 1, "two" -> 2)
      val emptyMap = Map.empty[String,Int]

    def seqToString[T](seq: Seq[T]): String = seq match {
      case head +: tail => s"$head +: " + seqToString(tail)   //匹配至少包含一个善元素的非空序列
      case Nil => "Nil"
    }
    for(seq <- Seq(nonEmptySeq,emptySeq,nonEmptyList,emptyList,nonEmptyVector,nonEmptyMap.toSeq,emptyMap.toSeq)){
      println(seqToString(seq ))
    }
  }
}
