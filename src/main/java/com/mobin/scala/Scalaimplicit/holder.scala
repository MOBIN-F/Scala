package com.mobin.scala.Scalaimplicit

/**
  * Created by Mobin on 2016/4/3.
  */
object holder {

  object  Foo{
    trait  Foo
    implicit val x = new Foo{
       override  def toString = "Companion Foo"
    }
  }
}
