package com.mobin.scala

/**
 * Created by Mobin on 2015/11/22.
 */
class ScalaApply {
}

class Base{
  def apply() ="mobin"
  def test: Unit ={
    println("test")
  }
}
//object里面的方法相当于方法，是个单例对象
object  Base{
  var count = 0;
  //初始化一个对象
  def apply() = new Base

  def static: Unit ={
    println("I'am a static method!!")
  }

  def add = {
    count = count + 1
  }
}
object ScalaApply extends  App{
  /*Base.static//相当于调用了静态方法*/
  val a = Base()//类名加()相当于调用了object中的apply方法
  a.test

  /*val b = new Base
  println(b())//对象名加()相当于调用了类中的apply方法*/

  /*for(i <- 1 to 10){
    Base.add
  }
  println(Base.count)*/
}

