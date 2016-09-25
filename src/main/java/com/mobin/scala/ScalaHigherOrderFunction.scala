package com.mobin.scala

import java.io.File

/**
 * Created by Mobin on 2016/1/2.
 */
class ScalaHigherOrderFunction {

}

//使用闭包减少代码量
object  ScalaHigherOrderFunction extends  App{
  private def fileHere = new File(".").listFiles()

  private  def filesMatching(macther :String => Boolean) =
       for (file <- fileHere; if macther(file.getName))
          yield  file

  def filesEnding(query :String) =
     filesMatching(_.contains(query))

    for(f <- filesEnding("i"))
      println(f.getName)
}
