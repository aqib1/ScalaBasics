package com.example.scala

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.language.implicitConversions
import scala.util.{Failure, Success, Try}

object Advanced extends App {
  lazy val temp = 2
  lazy val testBlock = {
    println("Hi there")
  }
  testBlock

  def strValue(): String = "Hi there"
  def nullValue(): String = null

  val optionalStr = Option(nullValue)
  optionalStr match {
    case Some(str) => println(s"value is $str")
    case None => println("value is null")
  }


  def throwException() = throw new RuntimeException
// java way
  try {
    throwException()
  } catch {
    case e: RuntimeException => println(s"Exception $e")
  }
  // scala way

 val tryStr = Try(throwException())

 tryStr match {
   case Success(value) => println(s"Received value $value")
   case Failure(exception) => println(exception)
 }


//  val thread = Future {
//    println("Loading...")
//    Thread.sleep(1000)
//    println("work is done!!")
//    67
//  }
//
//  Thread.sleep(2000)


  def add(implicit n: Int): Int = n + 1
  implicit val number = 23

  println(add)

  implicit class isEven(n : Int) {
    def even() = n%2 ==0
  }
  println(number.even())

}
