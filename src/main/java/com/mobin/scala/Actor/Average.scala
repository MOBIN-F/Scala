package com.mobin.scala.Actor

import scala.util.Random
import scala.actors.Actor

/**
  * Created by Mobin on 2017/7/19.
  */
object Average {

  val n = 4
  val nParts = 1
  val partSize = n / nParts
  var rands = rand(n)

  def rand(n: Int) = new Array[Int](n).map(_ => Random.nextInt(n))

  class AverageActor extends Actor {
    val now = System.nanoTime()
    var total = 0
    var countParts = 0
    def act {
      react{
        case i:Int => {
          total += i
          countParts += 1
          if (countParts < nParts){
            act
          }else{
            println(total  + "  ,  " + nParts )
            println("%d millseconds".format((System.nanoTime() - now)))
          }
        }
      }
    }
  }

  class SumActor(average: AverageActor) extends Actor{
    def act: Unit ={
      while (true){
        receive{
          case a: Array[Int] => {
            average ! a.sum /partSize
          }
        }
      }
    }
  }

  def main(args: Array[String]) {
    val avg = new AverageActor
    avg.start()

    (0 until nParts).foreach{
      i => (new SumActor(avg)).start() ! rands.slice(i * partSize, (i +1) * partSize)
    }
  }
}
