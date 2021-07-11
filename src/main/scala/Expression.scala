package com.example.scala

import scala.annotation.tailrec

object Expression extends App {
// val anyInt: Int = 2
// println(anyInt != 23)
// println(anyInt * 2 + 6 / 2)
// var newInt: Int = anyInt
// newInt += 5
// println(if (newInt == 7) 10 else 11)

 //  var i : Int = 0
 //  while (i < 5) {
 //    println(i)
 //    i += 1
 //  }

 //var i:Int = 0
 // for(i <- 0 until  10)
 //     println(i)
 // for(i <- 0 to 10)
 //      println(i)

// val comparisonBlock: Boolean = 2 < 3
//
// val DMASBlock : Int = {
//  val n1 :Int  = 2
//  val n2 :Int  = 3
//  val n3 :Int  = 12
//  val n4 :Int  = 1
//
//  n1 * n2 - n3 / n4
// }
//
// println(DMASBlock)
//
// println(print("Hi there", 3))
//
// def print(value : String, index : Int): String = {
//  if(index == 0) return value
//
//  value + "\n" + print(value, index - 1)
// }
//
// println(testFunction(3))
//
//
// def testFunction(value: Int): Int  = {
//  def testInner(value1: Int, value2: Int): Int =  value1 + value2
//
//  testInner(value, value - 1)
// }

 greetingFunction("Aqib", 28)

 def greetingFunction(name: String, age: Int) : Unit = {
  println(s"Hi my name is $name and i am $age years old!!")
 }

 println(factorial(5))

 def factorial(value: Int): Int = {
  if(value <= 1) return value
  value * factorial(value - 1)
 }

 println(fibonacci(8))

 println(fibonacciUpto(1, 9, ""))

 @tailrec
 def fibonacciUpto(start :Int, upto : Int, value: String): String = {
  if(start == upto) return value

  fibonacciUpto(start + 1 , upto, value+ "\n" + String.valueOf(fibonacci(start)))
 }

 def fibonacci(value: Int): Int = {
  if(value <= 2) return 1
  fibonacci(value - 1) + fibonacci(value - 2)
 }


}

