package com.mobin.scala

import java.io.File
import scala.io.Source
/**
  * Created by Mobin on 2016/4/3.
  *
  */
class RichFile(val file:File) {
     def read = Source.fromFile(file).getLines().mkString
}

object ImplicitFunction extends  App{
  implicit def file2RichFile(file: File) = new RichFile(file)
  val f = new File("E:\\Scala\\Scala\\src\\com\\mobin\\scala\\implicit\\file.log").read
  println(f)
}