package com.mobin.scala

/**
 * Created by Mobin on 2015/12/12.
 */
class ScalaTry {

}

object  ScalaTry extends  App{
  /*val n = 5;
  val half = if(n % 2 == 0) n/2
             else throw  new RuntimeException("n must be even")*/
  def f() :Int = try{return 1} finally {return 2}
  def g() :Int = try{ 1} finally { 2}
  println(f())
  println(g())
}


