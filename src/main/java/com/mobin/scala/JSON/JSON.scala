package com.mobin.scala.JSON
import net.liftweb.json._
import net.liftweb.json.compactRender
import net.liftweb.json.JsonAST
import net.liftweb.json.JsonDSL._
import net.liftweb.json.Printer.{compact,pretty}
import net.liftweb.json.Serialization.write
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.DefaultHttpClient

/**
  * Created by Mobin on 2016/9/25.
  */

case class Person(name: String, address: Address)
case class Address(city: String, state :String)
case class Winner(id: Long, numbers: List[Int])
case class Lotto(id: Long, winningNumbers: List[Int], winners: List[Winner], drawDate: Option[java.util.Date])

object JSON {

  def main(args: Array[String]) {
    implicit val formats = DefaultFormats  //日期转换

    val p = Person("mobin", Address("GuangDong", "GuangZhou"))
    val persons = List(Person("mobin", Address("GuangDong", "GuangZhou")),Person("kpop", Address("GuangDong", "GuangZhou")))
    val address = List(Address("GuangDong", "GuangZhou"),Address("kpop", "GuangDong"))


    val json = address.map (a => ("winner-id" -> a.city) ~ ("numbers" -> a.state))

    //println(compact(render(json)))

    println(compactRender(json))
    val stock = List(1,2,3)
    val stockAsJsonString = write(stock)
    // add the JSON string as a StringEntity to a POST req
    val post = new HttpPost("http://localhost:8080/stocks/saveJsonStock")
      post.setHeader("Content-type", "application/json")
    post.setEntity(new StringEntity(stockAsJsonString))
    // send the POST request
    val response = (new DefaultHttpClient).execute(post)
    // print the response
    println("--- HEADERS ---")
    response.getAllHeaders.foreach(arg => println(arg))

  }
}
