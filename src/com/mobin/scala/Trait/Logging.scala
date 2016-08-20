package com.mobin.scala.Trait

/**
  * Created by Mobin on 2016/8/20.
  */

trait Logging{
  def info (message: String): Unit
  def warning (message: String): Unit
  def error (message: String): Unit
}
