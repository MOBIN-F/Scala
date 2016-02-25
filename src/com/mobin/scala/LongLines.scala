package com.mobin.scala

import java.io.File

import scala.io.Source

/**
 * Created by Mobin on 2015/12/30.
 */
class LongLines {
}

object LongLines extends  App{
 private def fileHere =(new File((".")).listFiles())
  println(fileHere.size)

  def fileEnding(query : String) =
       for (file <- fileHere;if  file.getName.contains(query))
        yield file

    for (s <- fileEnding(".i"))
      println(s.getName);

}

