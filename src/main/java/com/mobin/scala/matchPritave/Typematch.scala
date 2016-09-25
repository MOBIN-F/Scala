package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * 再谈类型匹配
  */
object Typematch {

  def doSeqMtach[T](Seq: Seq[T]): String = Seq match {
    case Nil => "Nil"
    case head +: _ => head match {
      case _: String => "String"
      case _: Int => "Double"
      case _ => "Unmatch seq element"
    }
  }

  def main(args: Array[String]) {
    for(seq <- Seq( List(1,2,3,4), List("a","b"),Nil)){
      seq match {
        case seq: Seq[_] => println(s"Seq ${doSeqMtach(seq)},  $seq")
        case _ => println(s"Unknown!!  $seq")
      }
    }
  }
}
