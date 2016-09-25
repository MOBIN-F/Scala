package com.mobin.scala.IO
import scala.io.Source
/**
  * Created by Mobin on 2016/8/7.
  */
object ReadLine {
  def main(args: Array[String]) {
      Source.fromFile("f:\\test1","UTF-8").foreach{
       print;
     }

//     val lineIterator = source.getLines();
//     for(i <- lineIterator)
//       println(i.mkString)

  }
}
