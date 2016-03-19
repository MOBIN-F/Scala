package com.mobin.scala.Actor


import  scala.actors.Actor  //Actor 是个特质，只有start方法
/**
  * Created by Mobin on 2016/3/19.
  */
object ScalaActor extends  App{

  /*val ser = actor{
    for(i <- 1 to 5)
      println("mobin")引入方法import  scala.actors.Actor._可以直接运行输出结果
  }*/
  object ActorTest extends  Actor {
    def act()  {
      receive {
        case x: Int => println("参数值类型为int")
      }
    }
  }

  ActorTest.start()
  ActorTest ! 1
  ActorTest ! "5"

  /*
  * actor只会处理传给receive方法的偏函数中的某个样本相匹配的消息，对邮箱中的每个消息，receice都会先调用传入的偏函数的isdefinedAt方法
  * 来决定它是否与某个样本匹配，然后处理该消息。receive方法将选定邮箱中第一个让isDefindAt返回true的消息，将这个消息传递给偏函数的
  * apply方法。 而偏函数的apply方法将会处理这个消息。
  * */




}
