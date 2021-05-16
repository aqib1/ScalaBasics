package com.example.scala

import java.util.Optional

object Main {
  def main(args: Array[String]) {

    var multi = Array(Array(2, 1, 1), Array(3, 2, 1))

//      var arr = Array(2, 3, 1, 2)
//      var total = 0;
//
//      for(value <- arr) {
//        total += value;
//      }
//
//      println(total)

//    println(strToLen(Some("aqib")))

//    testOption("aqib", 1, Some("javed"))
//    testOption("ali", 2, null);

//    var arr = new Array[Int](3)
//    println(arr(0))
//
//    var arr1 = Array(0, 1, 2)
//    println(arr1(0))

    //    var t = (1, true, "ali")
//    println(t._1)
//    var value = "aqib";
//    println(value.substring(1));
//    var list = List(1, 2, 3, 4, 5)
//    for(i <- 1 to 10) {
//      println(hello("" + i))
//    }
  }

  def hello(name : String) : String = "Hello " + name



  def strToLen(str : Option[String])  =  {
     str.map(_.length).getOrElse(-1);
  }

  def testOption(name : String, id : Int, lastName : Option[String])  = {
    lastName match {
        case Some(lastName) => println(s"Hello $name $lastName")
        case None => println("Nothing found")
    }
  }
}
