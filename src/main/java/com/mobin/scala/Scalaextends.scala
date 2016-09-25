package com.mobin.scala

/**
 * Created by Mobin on 2015/11/9.
 */
class Scalaextends {

}
class Persons(var name : String,val age : Int){
    println("person")
}

class Student(name : String,age : Int,val major : String) extends Persons(name,age){
  println("name:" + name + "age:" + age + "major:" + major)
  //覆盖父类的方法
  override  def  toString = ("override toString")
}

object  Scalaextends{
  def main(args: Array[String]) {
         val s = new Student("mobin",20,"IT")
         println(s)
  }


}