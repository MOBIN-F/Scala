package com.mobin.scala.File

import java.io.File

/**
  * Created by Mobin on 2017/7/20.
  */
object ErdogicDir {

  def subhdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subhdirs _)
  }

  def main(args: Array[String]) {
    val file = new File("E:\\Common7")
    for (d <- subhdirs(file)){
      println(d.getName)
    }
  }

}
