package com.mobin.scala.Actor

import java.io.File
import scala.actors.Actor
import scala.io.Source

/**
  * Created by Mobin on 2017/7/20.
  * 编写一个程序，对给定的目录下所有子目录的所有文件中匹配某个给定的正则表达式
  * 的单词进行计数。对每一个文件各采用一个actor，另外再加上一个actor用来遍历所有子目录，还有一个actor将
  * 结果汇总到一起
  */
object WordCount {

  def subDir(dir: File): Iterator[File] = {
    if (dir.isDirectory) {

    }
    val children =dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDir _)
  }

  class ErdogicDirActor() extends Actor{
    def act: Unit ={
      while (true){
        receive{
          case dir: File => {
            dir.listFiles.foreach{
              _ match {
                case f: File if f.isDirectory => this!f
                case f: File =>  new ReadFileActor().start() ! f
              }
            }
          }
        }
      }

    }
  }

  class ReadFileActor extends Actor{
    def act: Unit ={
       react{
         case file: File => {
           val line = Source.fromFile(file).getLines()
           println(file.getName)
         }
       }
    }
  }

  def main(args: Array[String]) {
    val dir = new File("E:\\Shell Script")
    new ErdogicDirActor().start() ! dir
  }
}
