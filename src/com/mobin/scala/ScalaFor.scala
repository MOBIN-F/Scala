package com.mobin.scala



/**
 * Created by Mobin on 2015/12/12.
 */
class ScalaFor {

}

object  ScalaFor extends  App{
  val filename = (new java.io.File(".")).listFiles()

  for(file <- filename)
    if(file.getName.endsWith(".scala"))
        println(file)

  for(file <- filename if file.getName.endsWith(".scala"))
    println(file)

   //如果在发生器中加入超过一个过滤器，if子句必须用分号分隔，
  for(file <- filename if file.isFile; if file.getName.endsWith(".scala"))
    println(file)

  for(i <- 1 to 5)
    println(i)

  for(n <- 1 until 5)
    println(n)
  //嵌套循环

   def fileLines(file : java.io.File) = scala.io.Source.fromFile(file).getLines().toList

  def grep (patten : String) =
    for(file <- filename
        if file.getName.endsWith(".scala");
         line <- fileLines(file);
        if line.trim.matches(patten))
      println(file +":" + line.trim)


  val xvalue = Range(1,5)
  val yvalue = Range(1,3)
  val coor = for(x <- xvalue;
                 y <- yvalue)yield(x,y)
  val coor1 = for{x <- xvalue
                 y <- yvalue}yield(x,y)
  println(coor1)

}
