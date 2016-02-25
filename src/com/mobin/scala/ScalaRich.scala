package com.mobin.scala

/**
 * Created by Mobin on 2015/11/25.
 */
class ScalaRich {

}

class A{

}

class RichA(a : A){
  def rich{
  println("rich....")
  }
}

object  ScalaRich extends  App{
  implicit  def A2RichA(a : A) = new RichA(a)
  val a = new A
  a.rich


  def aa(implicit  name : String)= println(name)


  implicit val  name = "mobin"
  aa
}
