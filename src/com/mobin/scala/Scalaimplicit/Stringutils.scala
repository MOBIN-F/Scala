package com.mobin.scala.Scalaimplicit

import java.util.RandomAccess

/**
  * Created by Mobin on 2016/4/3.
  * 将隐式类定义在伴生对象中
  */
object Stringutils {
  implicit class StringImprovement(val s : String){
      def increment = s.map(x => (x +1).toChar)
  }
}

object  Main extends  App{
  import com.mobin.scala.Scalaimplicit.Stringutils._
  println("mobin".increment)

  //编译器在mobin对象调用increment时发现对象上并没有increment方法，此时编译器就会在作用域范围内
  //通过隐式转换将对象转换成具有这个方法的对象
}