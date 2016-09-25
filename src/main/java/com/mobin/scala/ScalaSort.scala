package com.mobin.scala

/**
 * Created by Mobin on 2016/1/3.
 */
class ScalaSort {

}

object ScalaSort extends  App{
  def isort(xs : List[Int]) : List[Int] =
     if(xs.isEmpty)
       Nil
     else
       insert(xs.head,isort(xs.tail))

  def insert(x : Int,xs : List[Int]) : List[Int] =
     if(xs.isEmpty || x <= xs.head)
       x :: xs
     else
       xs.head :: insert(x,xs.tail)

  val l = isort(List(2,1,8,6))
  for(x <- l)
     println(x)
 /* def isort(xs : List[Int]) : List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x,isort(xs1))
  }

  def insert(x : Int,xs : List[Int]) : List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs
                    else  y :: insert(x,ys)
  }
  val l = isort(List(2,1,12,8))
  for(x <- l)
    println(x)*/
}
