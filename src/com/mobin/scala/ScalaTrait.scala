package com.mobin.scala

/**
 * Created by Mobin on 2015/11/22.
 */
class ScalaTrait {

}

trait Philosophical {
  def philosophical: Unit = {
    println("Philosophical")
  }
}

trait Frog extends  Philosophical {
  override def philosophical: Unit = {
    println("frog")
  }
}

abstract  class Count{
  def save
}

class Mycount extends Count with Philosophical{
  def save: Unit = {
    philosophical
  }
}

object  ScalaTrait{
  def main(args: Array[String]) {
     /*  val frog = new Frog
       frog.philosophical

       val phil :Philosophical = frog
       phil.philosophical

       val mycount = new Mycount
       mycount.save
       mycount.philosophical
       mycount.toString*/
     //往对象混入特质
    val mycount =new Mycount with Frog
     mycount.save//调用Philosophical里的方法,输出frog
  }
}