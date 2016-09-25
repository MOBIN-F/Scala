package com.mobin.scala

/**
 * Created by Mobin on 2015/11/6.
 */
class ScalaClass {

}
/*class  Person{
  var name : String = _ //——表示前面的变量
  val age = 10
  private[this] val id = 1 //只能在内部使用，实例不能使用
}*/

//1.主构造器直接跟在类名后面
//2.主构造器执行的时候，会执行类中的所有语句
//3.如果参数声明时不带val和var，那么相当于private[this],这样外部的实例不能访问会报错
class Personss(val name : String,val age : Int){
 /* println("Person(val,val)")
  var gender : String = _
  var names : String = _
  var ages :Int = _
  //副构造器
  def this(names:String,ages : Int,gender : String){
    this(names,ages)  //第一行一定要先调用已存在的构造器
    this.names = names
    this.ages = ages
    this.gender = gender
  }
}
object ScalaClass{
  def main(args: Array[String]) {
   /* val p = new Person
    p.name = "mobin"*/

    /*val p = new Person("m22obin",20,"pp")
    println(p.names + ":"+ p.ages + ":" + p.gender)*/
  }*/
}
