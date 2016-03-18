package com.mobin.scala.Actor

import scala.actors._

/**
  * Created by Mobin on 2016/3/18.
  */
object ScalaActor2 extends  App{

     object  hiactor extends  Actor {
       def act(): Unit = {
         loop {   //loopWhilw(条件)//条件为真时才执行括号内的，否则不执行
         react {
           //react使用后就会释放线程，若要一起启动线程可用loop
           case 1 => println("one")
           case 2 => println("two")
           case 3 => println("three")
           case 4 => react { case 5 => println("four+five")}
         }
         }
       }
     }

  hiactor.start()
//  for(i <- 1 to 5)
    hiactor ! 1
    hiactor ! 4
    hiactor ! 3
    hiactor ! 5//把这行注释掉hiactor ! 3不会执行
}
