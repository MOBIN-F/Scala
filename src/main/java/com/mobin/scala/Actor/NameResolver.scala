package com.mobin.scala.Actor

import java.net.{UnknownHostException, InetAddress}

import scala.actors._

/**
  * Created by Mobin on 2017/7/17.
  */
object NameResolver extends Actor{

  def act(): Unit ={
    react {
      case (name: String, actor: Actor) =>
        actor ! getIp(name)
        act()
      case "EXIT" =>
        println("exiting")
      case msg =>
        println(msg)
        act()
    }
  }

  def getIp(name: String): Option[InetAddress] = {
    try{
      Some(InetAddress.getByName(name))
    }catch {
      case  _: UnknownHostException => None
    }
  }
}

object Main extends App{
  NameResolver.start()
  NameResolver ! ("www.scala-lang.org", NameResolver)
  NameResolver ! ("mobin", NameResolver)
  Thread.sleep(50000)
  NameResolver !"EXIT"
}
