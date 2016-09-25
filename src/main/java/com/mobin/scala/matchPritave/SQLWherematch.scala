package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * 可变参数列表的匹配
  */
object SQLWherematch {

  object Op extends Enumeration{
    type Op = Value

    val EQ = Value("=")
    val NE = Value("!=")
    val LTGT = Value("<>")
    val LT = Value("<")
    val LE = Value("<=")
    val GT = Value(">")
    val GE = Value(">=")
  }

  import Op._

  case class WhereOp[T](columnName:String, op: Op, value: T)

  case class WhereIn[T](columnName: String, val1: T, value: T*)



  def main(args: Array[String]) {
    val wheres = Seq(
      WhereIn("state", "IL", "CA", "VA"),
      WhereOp("state", EQ, "IL")
    )

    for(where <- wheres){
      where match {
        case WhereIn(col, val1, vals @ _*) =>    //匹配可变参数的的语法形式：name @  _*
            val str = (val1 +: vals).mkString(",")
          println(s"WHERE $col IN ($str)")
        case WhereOp(col, op, value) =>println(s"WHERE $col  $op  $value")
      }
    }
  }
}
