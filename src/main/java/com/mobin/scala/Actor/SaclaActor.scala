package com.mobin.scala.Actor

import scala.actors.Actor._
/**
  * Created by Mobin on 2016/3/18.
  */
object SaclaActor extends  App{
      def sum(n : Int):Int =
          if(n >1) sum(n - 1) + n else 1

      def sum1(n :Int) =
         n to n+10 foreach(i => println(sum(i)))

      def sum2(n : Int) =
         n to n + 10 foreach(i => actor({
           react{
             case  n : Int => println(sum(n))
           }
         } ) ! i) //将i的值传入actor

      val a = 85;
      sum2(a)
}
