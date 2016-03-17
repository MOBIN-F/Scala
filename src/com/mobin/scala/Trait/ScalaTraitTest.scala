package com.mobin.scala.Trait

/**
  * Created by Mobin on 2016/3/17.
  * 当混入多个特质时，会去掉重复的方法，且只保留右侧特质中重复的方法
  */
object ScalaTraitTest {
      trait one {
        def a()
      }

    trait two extends one{
      override def a(){print("two  ")}
      a
    }

    trait three extends one{
      override  def a(){print("three  ")}
      a
    }

    class  Name(){

    }




    def main(args: Array[String]): Unit = {
      val one = new Name() with two with three
      println()
      val two = new  Name() with three with two
    }
}

