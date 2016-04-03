package com.mobin.scala.implicitPackage

import java.io.File

/**
  * Created by Mobin on 2016/4/3.
  */
class FileWrapper(val file : File) {
    def / (next :String) = new FileWrapper(new File(file,next))
    override  def toString = file.getCanonicalPath
}

object FileWrapper extends  App{
  implicit def wrap(file : File) = new FileWrapper(file)  //File => WrapperFile
  val cur = new File("F:\\")
  val newFile = cur / "mobin.txt"
  println(newFile)
}