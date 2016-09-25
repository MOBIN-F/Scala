package com.mobin.scala.Scalaimplicit
import java.io.File
import scala.io.Source

/**
  * Created by Mobin on 2016/4/3.
  */

 package implicitFunctions{
   object ImplicitFunctions{
      implicit  def file2RichFile(file :File) = new RichFile1(file)
   }
 }

class RichFile1(file :File) {

     def read = Source.fromFile(file).getLines().mkString
}

object  impFun extends  App{
     //引入implicitFunctions包下的所有隐式转换函数
     import com.mobin.scala.Scalaimplicit.implicitFunctions.ImplicitFunctions._
     val file=  new File("E:\\Scala\\Scala\\src\\com\\mobin\\scala\\implicitPackage\\file.log").read
     println(file)
}
