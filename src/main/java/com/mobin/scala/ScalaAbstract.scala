package com.mobin.scala

/**
 * Created by Mobin on 2015/11/22.
 */
class ScalaAbstract {

}

abstract class Amina{
  //抽象方法不需要加abstract，只需要不写方法体
  def eat
  //父类可以声明抽象字段（没有初始值的字段）
  val name : String
  var age :Int
}


class Dog() extends  Amina{
  //重写父类的抽象方法不需要加override关键字
  def eat: Unit = {
    println("eat")
  }

  val name = "mobin"
  var age =22

}

object ScalaAbstract{
  def main(args: Array[String]) {
     val dog = new Dog()
     dog.eat
    println(dog.name+" and "+dog.age)
  }
}