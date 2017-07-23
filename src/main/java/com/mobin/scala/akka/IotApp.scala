package com.mobin.scala.akka

import akka.actor.Actor.Receive
import akka.actor.{ActorSystem, Props, ActorLogging, Actor}

import scala.io.StdIn

/**
  * Created by Mobin on 2017/7/23.
  */
object IotApp {
  def main(args: Array[String]) {
    val system = ActorSystem()
    try{
      //1.val supervisor = system.actorOf(IotSupervisor.props(), "iotsupervis-actor")
      val supervisor = system.actorOf(Props[IotSupervisor], "iotsupervis-actor")
      //val supervisor = system.actorOf(Props(new IotSupervisor), "iotsupervis-actor")
      StdIn.readLine()
    } finally {
      system.terminate()
    }

  }
}
class IotSupervisor extends Actor with ActorLogging{
  override def preStart(): Unit = log.info("Iot App started")
  override def postStop(): Unit = log.info("Iot App stopped")
  override def receive: Receive = Actor.emptyBehavior
}

//1.object IotSupervisor{
//  def props(): Props = Props(new IotSupervisor)
//}
