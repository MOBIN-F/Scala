package com.mobin.scala.matchPritave

/**
  * Created by Mobin on 2016/8/21.
  */
object Tuplematch {

  def main(args: Array[String]) {
    val langs = Seq(
      ("Scala",  "Martin",  "Odersky"),
      ("Clojure",  "Rich",  "Hickey")
    )

    for(tuple <- langs){
      tuple match {
        case ("Scala", _,  _) => println("Found Scala")
        case (lang,first,second) => println(s"Found Othre language:   $lang($first,$second)")
      }
    }
  }
}
