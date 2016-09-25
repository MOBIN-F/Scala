package com.mobin.scala.Scalaimplicit

/**
  * Created by Mobin on 2016/4/4.
  */

class SwingType{
  def  wantLearned(sw : String) = println("兔子已经学会了"+sw)
}
package swimmingPage{
object swimming{
  implicit def learningType(s : AminalType) = new SwingType
  }
}

class AminalType

object AminalType extends  App{
  import com.mobin.scala.Scalaimplicit.swimmingPage.swimming._
  val rabbit = new AminalType
    rabbit.wantLearned("breaststroke")         //蛙泳
}

