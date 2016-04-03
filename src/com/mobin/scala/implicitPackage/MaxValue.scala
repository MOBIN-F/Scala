package com.mobin.scala.implicitPackage

/**
  * Created by Mobin on 2016/4/3.
  */
object MaxValue extends  App{

  def maxListUpBound[T](e : List[T]) (implicit  orderer : T => Ordered[T]) : T=
         e match {
           case List() =>
               throw new IllegalArgumentException("empty list!!")
           case List(x) =>  x    //List(x)表示List只有一个元素
           case x :: rest =>
             val  maxRest = maxListUpBound(rest)(orderer)
             if(orderer(x) > maxRest) x
             else maxRest
         }

 /* def m[T](e : List[T]) =
     e match{
       case List(x) => println(x)
     }

  //  m(List(1,2))   //报错
    m(List(1))*/
  println(maxListUpBound(List(5,6,3)))
  println(maxListUpBound(List("one","two","three")))
}
