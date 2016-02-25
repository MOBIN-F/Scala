package com.mobin.scala
import  scala.collection.mutable.Set
/**
 * Created by Mobin on 2015/11/2.
 */
object  ScalaSet{
  def main(args: Array[String]) {
   /* var jetSet = Set("mobin","kpop")
    jetSet += "sj"
    println(jetSet.contains("sj"))*///true

    //要使用不可变Set，需要引用scala.collection.mutable.Set
    val movieSet = Set("mobin","kpop")
    movieSet += "sj"
    println(movieSet)
  }
}
