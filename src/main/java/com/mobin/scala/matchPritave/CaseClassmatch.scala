package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  * Case的匹配
  */
object CaseClassmatch {

  def main(args: Array[String]) {
    case class Address(street: String, city: String, count: String)
    case class Person(name: String, age: Int, address: Address)

    val alice = Person("Alice", 25 ,Address("1 scala Lane", "Chicago","USA"))
    val mobin = Person("Mobin", 22 ,Address("1 scala Lane", "guangdong","CN"))

    for (person <- Seq(alice,mobin)){
      person match{
        case Person("Alice", 25, Address(_,"Chicago",_)) => println("hi Alice")
        case Person(name,age, _) => println(s"Who are you.$age year-old person named $name?")
      }
    }
  }
}
