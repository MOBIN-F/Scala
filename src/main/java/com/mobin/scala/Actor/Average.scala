package com.mobin.scala.Actor

import scala.util.Random
import scala.actors.Actor

/**
  * Created by Mobin on 2017/7/19.
  * 编写一个程序，生成由n个随机数组成的数组，然后通过将工作分发给多个actor的方式计算这些数的平均值，第个actor计算子区间
  * 的值之后 ，将结果发送给一个能组合出结果的actor
  */
object Average {
  val n = 4
  val nParts = 2
  val partSize = n / nParts  //对数据进行分片
  var rands = rand(n)

  def rand(n: Int) = new Array[Int](n).map(_ => Random.nextInt(n))
  val arr = Array[Int](1,2,3,4)

  class AverageActor extends Actor {
    val now = System.nanoTime()
    var total = 0.0
    var countParts = 0
    def act {
      react{
        case i:Int => {
          total += i
          countParts += 1
          if (countParts < nParts){
            act
          }else{
            println(total /n )
            println("%d millseconds".format((System.nanoTime() - now)))
          }
        }
      }
    }
  }

  class SumActor(average: AverageActor) extends Actor{
    def act: Unit ={
      while (true){
        react{    //使用react更好，因为不需要常驻线程
          case a: Array[Int] => {
            average ! a.sum
          }
        }
      }
    }
  }

  def main(args: Array[String]) {
    val avg = new AverageActor
    avg.start()

    (0 until nParts).foreach{
      i => (new SumActor(avg)).start() ! arr.slice(i * partSize, (i +1) * partSize)
    }
  }
}
