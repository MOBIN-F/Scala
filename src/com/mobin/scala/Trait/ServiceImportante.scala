package com.mobin.scala.Trait

/**
  * Created by Mobin on 2016/8/20.
  *
  */
class ServiceImportante(name: String) {
    def work(i: Int): Int = {
        println("ServiceImportante:Doing import word!!" + i)
        i + 1
    }
}
object ServiceImportante {
  val service = new ServiceImportante("doc") with StdoutLogging{
    override def work(i: Int): Int = {
      info("Starting work: " + i)
      val re  = super.work(i)
      info("Ending work: " + i + "," + re)
      re
    }
  }
  def main(args: Array[String]) {
    (1 to 3) foreach(i => println("Result:  " + service.work(i)))
  }
}