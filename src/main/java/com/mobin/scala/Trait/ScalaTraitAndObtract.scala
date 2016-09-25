package com.mobin.scala.Trait

/**
  * Created by Mobin on 2016/3/17.
  */
object ScalaTraitAndObtract {

  trait  Logger{
    def log(msg : String)  //声明一个特质

    def warn(msg : String): Unit = {
      log("warn   "+msg)
    }

    def  server(msg : String): Unit ={
        log("server   "+msg)
      }

  }


  class week extends  Logger{
    def log(msg : String): Unit ={
      println(msg)
    }

    server("serviceHello")
  }

  def main(args: Array[String]) {
    val w = new week();
  }
}
