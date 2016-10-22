package com.mobin.scala.example

import java.io.FileWriter

import scala.util.Random

/**
  * Created by Mobin on 2016/10/22.
  */
object UserDataGenerator {

  private val FILE_PATH = "E:\\USER_DATA.txt"
  private val  ROLE_ID_ARRY = Array[String]("ROLE001","ROLE002","ROLE003","ROLE004")
  private val REGION_ID_ARRY = Array[String]("RGE001","RGE002","REG003","REG004")
  private val MAX_USER_AGE = 60   //最大年龄
  private val MAX_RECOREDS = 1000000    //数据总数

  def main(args: Array[String]) {
     generatorDataFile(FILE_PATH, MAX_RECOREDS)
  }

  private def generatorDataFile(filePath: String, recordNum: Int): Unit ={
    var write: FileWriter = null
    try{
      write = new FileWriter(filePath, true)
      val rand = new Random()
      for(i <- 1 to recordNum) {
        val gender = getRandomGender() //产生性别
        var age = rand.nextInt(MAX_USER_AGE)
        if (age < 10) {
          age = age + 10
        }
        var year = rand.nextInt(16) + 2000 //年份
        var month = rand.nextInt(12) + 1
        var day = rand.nextInt(28) + 1
        var registerDate = year + "-" + month + "-" + day;
        var roleIndex = rand.nextInt(ROLE_ID_ARRY.length);
        var role = ROLE_ID_ARRY(roleIndex)

        var regionIndex = rand.nextInt(REGION_ID_ARRY.length)
        var region = REGION_ID_ARRY(regionIndex)

        write.write(i + "\t" + gender + "\t" + age + "\t" + registerDate + "\t" + role + "\t" + region)
        write.write(System.getProperty("line.separator"))
      }
        write.flush()
    }catch {
        case e: Exception => println("Error occurred" + e)
    }finally {
        if(write != null) write.close()
    }
    println("finshed")
  }

  private def getRandomGender(): String = {
    val rand = new Random()
    val random = rand.nextInt(2) + 1
    if(random % 2 == 0) "M" else "F"
  }
}
