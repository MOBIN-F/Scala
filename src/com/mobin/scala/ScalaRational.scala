package com.mobin.scala

/**
 * Created by Mobin on 2015/11/27.
 */
class ScalaRational {

}

class Rational(n : Int,d : Int){
 // println("Create:"+n+"/"+d)
  //添加先决条件检查
  //如果传入的值为真。required将正常返回，继续执行程序，否则抛出IllegaArgumentException
  require(d != 0)
  private val g = gcd(n.abs,d.abs)
  val number :Int = n / g
  val denom : Int = d / g
  override def toString = number + "/" + denom

  //添加加法功能
  def +(that : Rational) : Rational =
       new Rational(
          number * that.denom + that.number * denom,denom * that.denom
       )

  //辅助构造器//this指向当前执行方法被调用的对象实例,如果在构造器里使用就是正在构建的对象实例
   def this(n :Int) = this(n,1)

  //私有方法
  private def gcd(a : Int,b : Int) : Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }

}

object ScalaRational extends  App{
   val r = new Rational(5,2)
   println(r)

  val add1 = new Rational(1,2)
  val add2 = new Rational(2,3)
 val result =  add1 + add2
  println(result)
  val gcd1 = new Rational(-66,42)
  println(gcd1)
}