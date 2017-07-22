package com.mobin.scala.Actor

import java.io.File
import scala.actors.Actor
import scala.io.Source
import scala.util.matching.Regex

/**
  * Created by Mobin on 2017/7/20.
  * 编写一个程序，对给定的目录下所有子目录的所有文件中匹配某个给定的正则表达式
  * 的单词进行计数。对每一个文件各采用一个actor，另外再加上一个actor用来遍历所有子目录，还有一个actor将
  * 结果汇总到一起
  */
object WordCount {
  case class CountFileValue(n: Int)
  case class TotalFiles(n: Int)

  def subDir(dir: File): Iterator[File] = {
    if (dir.isDirectory) {

    }
    val children =dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDir _)
  }

  class ErdogicDirActor(a:File => Unit,countActor: CountActor ) extends Actor{
    var countFile = 0
    var countDir = 1
    def act: Unit ={
      while (true){
        receive{
          case dir: File => {
            dir.listFiles.foreach{
              _ match {
                case f: File if f.isDirectory => countDir += 1;this!f
                case f: File => countFile +=1; a(f)
              }
            }
            countDir -= 1
            println(countDir)
            if (countDir == 0) {
              countActor! TotalFiles(countFile)
              exit()
            }
          }
        }
      }
    }
  }

  class ReadFileActor(rex: Regex, countActor: CountActor) extends Actor{
    def act: Unit ={
       react{
         case file: File => {
           val word = Source.fromFile(file).getLines().mkString
           countActor ! CountFileValue(rex.findAllIn(word).size)
         }
       }
    }
  }

  class CountActor extends Actor{
    var count = 0
    var totalFile = 0
    var sum = 0
    def  act: Unit ={
        loop{
          react{
            case CountFileValue(n) => {
              count += 1
              sum += n
              if (count == totalFile){
                println("符合的单词数为：" + sum)
                exit()
              }
            }
            case TotalFiles(n) => {
              totalFile = n
              if (totalFile ==0)
              exit()
            }
          }
        }
    }
  }

  def main(args: Array[String]) {
    val dir = new File("E:\\Shell Script")
    val rex = """mobin""".r

    val countActor = new CountActor()
    countActor.start()

    //隐匿转换传入一个文件，返回一个Actor
    new ErdogicDirActor(
      (f: File) => new ReadFileActor(rex, countActor).start()!f,
      countActor
    ).start() ! dir
  }
}
