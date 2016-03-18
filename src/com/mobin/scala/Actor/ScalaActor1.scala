package com.mobin.scala.Actor
import  actors.Actor
/**
  * Created by Mobin on 2016/3/18.
  */
object ScalaActor1 extends  App{

  class hiactor extends  Actor{
    def act(){
      while (true){
        receive {
          case   msg:String => println("hello  " + msg)
        }
      }
    }
  }

  def SHOW(m :String) = {
    val ACTOR1 = new hiactor
    ACTOR1.start
    ACTOR1 ! m
    ACTOR1 ! m + m}   //m+m的值总是在m之后输出
    val scala = Array("spark","hadoop","storm")
    for (i <- scala)
      SHOW(i)
}
