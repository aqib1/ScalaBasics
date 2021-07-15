package com.example.scala

object CbnVsCbv extends App {
  def callByValue(x: Long): Unit = {
    println(s"Call by value $x")
    println(s"Call by value $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"Call by name $x")
    println(s"Call by name $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def infinite(x: Int): Int =  x + infinite(x)

  def printInfinite(x: Int, y: => Int) : Unit = println(x)

  // call by value is a eager evaluation
//  printInfinite(infinite(1), 2)
  // call by name is a lazy evaluation
  printInfinite(2, infinite(1))


  def test(height: Int = 23, width: Int): Unit =
    println(s"height is $height and width is $width")

  test(width = 11)
}
