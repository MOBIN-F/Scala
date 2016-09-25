package com.mobin.scala.Trait

/**
  * Created by Mobin on 2016/8/20.
  */

trait  StdoutLogging extends Logging{
  def info(message: String) = println("INFO: " + message)
  def warning(message: String) = println("WARNING: " + message)
  def error(message: String) = println("ERROR: :" + message)
}