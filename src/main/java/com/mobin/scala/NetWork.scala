package com.mobin.scala

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Mobin on 2016/4/17.
  */
class NetWork {

  private val menbers = new ArrayBuffer[Member]()

  class Member(val name : String){
       val contants = new ArrayBuffer[Member]()
  }

  def join(name : String) = {
    val m = new Member(name)
    menbers += m
    m
  }
}
object NetWork{
  def main(args: Array[String]) {
    val chatter = new NetWork
    val myFace = new NetWork
    println(chatter == myFace)//chatter和 myFace是两个不同的类

    val mobin = chatter.join("mobin")
    val kpop = chatter.join("kpop")
    val m = (mobin.contants += kpop)

    val lucy = myFace.join("lucy")
    //val m2 = mobin.contants += lucy  编译不过，解决办法就是将Member类放到object对象中
  }
}