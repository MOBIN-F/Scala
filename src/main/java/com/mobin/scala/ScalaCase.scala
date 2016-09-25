package com.mobin.scala

/**
 * Created by Mobin on 2015/11/25.
 */
class ScalaCase {

}

case class  Book(var name : String,author : String){


}

object  ScalaCase extends  App{
     val macTalk = Book("macTalk","CJQ");
     macTalk match {
       case  Book(name,author) => println("This is Book!")
       case  _ => println("Other")
     }

    val firstArg = List("mobin","kpop")

      firstArg(1) match {
        case "mobin" => println("i am mobin")
        case "kpop" => println("i am kpop")
        case _ => println("i ...")
      }

    val name =
       firstArg(0) match {
         case "mobin" => "mobin"
         case "kpop" => "kpop"
         case _ => "other"
       }
  println(name)

  def searchFrom(i :Int) : Int =
     if(i >= 5) -1
     else if(i <=3) searchFrom(i+1)
     else searchFrom(i+2)

  val  n = searchFrom(2)
  println(n)
  println("----------------------------")
  def describe(x : Int) = x match {
    case 1 => println("x=1")
    case 2 => println("x=2")
    case _ =>
  }

  describe(20)

  def listcase(x : Any) = x match {
    case List(0,1,c @ List(0,1)) => println(c)
    case _ => println("other")
  }

  val l = List(0,1,0)
  listcase(l)
}
