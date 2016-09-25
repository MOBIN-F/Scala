package com.mobin.scala.Scalaimplicit

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
             val  maxRest = maxListUpBound(rest)/*(orderer)*/ //隐式参数可以被省略
             if(orderer(x) > maxRest) x
             else maxRest
         }

  /*
  *  视界：T <% Ordered[T]指“任何的T都好，只要T能被当作Orderer[T]即可”
   *  def maxListUpBound[T <% Ordered[T]](e : List[T]) =
         e match {
           case List() =>
               throw new IllegalArgumentException("empty list!!")
           case List(x) =>  x    //List(x)表示List只有一个元素
           case x :: rest =>
             val  maxRest = maxListUpBound(rest)/*(orderer)*/ //隐式参数可以被省略
             if(orderer(x) > maxRest) x
             else maxRest
         }
  * */

 /* def m[T](e : List[T]) =
     e match{
       case List(x) => println(x)
     }

  //  m(List(1,2))   //报错
    m(List(1))*/
  println(maxListUpBound(List(5,6,3)))
  println(maxListUpBound(List("one","two","three")))
}
