package com.example.scala

object Main {
  def main(args: Array[String]) {

    var t = (1, true, "ali")
   println(t._1)
    var value = "aqib";
    println(value.substring(1));
    var list = List(1, 2, 3, 4, 5)
//    for(i <- 1 to 10) {
//      println(hello("" + i))
//    }
  }

  def hello(name : String) : String = "Hello " + name
}
