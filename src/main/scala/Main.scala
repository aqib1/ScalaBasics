package com.example.scala
abstract class AnimalTest {
   def test(): Unit
}
trait Carnivores extends Any {
  def test(): Unit = {
    println("testing")
  }

  def eatMeat(): String
}
object Main extends App {
  val animal = new AnimalTest {
    override def test(): Unit = println("Hi there")
  }

  animal.test()
//  val teacher: Teacher = new Teacher("Ali")
//  println(teacher.calculateAge(-10))
//  val loin = new Lion
//  loin eat "Goat"
//  println(loin.foodSpecial)
//  println(loin.eatMeat())
}

//class Person {
//
//  private var name = ""
//
//  def getName= name
//
//
//  def setName(newName: String) {
//      name = newName;
//  }
//
//  override def toString: String = "This name is ".concat(name)
//
//}
//
//
//trait Point {
//  def mulPoints: Double
//}
//
//class Point2D(p1: Double, p2: Double) extends Point {
//  override def mulPoints: Double = p1 * p2
//}
//
//class Point3D(p1: Double, p2: Double, p3: Double) extends Point {
//  override def mulPoints: Double = p1 * p2 * p3
//}
//
//
//object Main {
//  def main(args: Array[String]) {
//
////    val number: Int = 23
////    val longNumber: Long = 3999999999l
////    val helloMessage: String = "Hi there"
////    println(helloMessage)
////
////    val concatStr: String = helloMessage.concat(" Hi there")
////    val concatWithPlus: String = helloMessage + " Hi there"
////    val concatWithInterpolation = s"$concatWithPlus bye there"
////    println(concatWithInterpolation)
////
////    val result: Int = if(number > 100) 500 else -9
////    println(result)
////    val codeBlock: String = {
////      "Hi there"
////    }
////
////    val shortCodeBlock: String = "Bye there"
//
//
////    var point2d = new Point2D(2.3, 33.1)
////    println(point2d.mulPoints)
////
////    var point3d = new Point3D(1.1, 2.45, 3.12)
////    println(point3d.mulPoints)
//
//
////      var person = new Person
////      person.setName("Aqib")
////
////    println(person)
//
////    var g : Int => String = i => i + "" + 2;
////
////    println(g(2))
////
////    g = i => i + "ABC"
//
////      println(hello("Aqib"))
////    var arr1 = Array(1, 2, 3); var arr2 = Array("A", "B", "C")
////
////    var flatten = for(i <- arr1; j <- arr2) yield j + i
////
////    for(f <- flatten) {
////      println(f)
////    }
//
////    var total = 0
////
////    for(i <- Range(0, 4)) {
////      total += 1;
////    }
////
////    println(total)
//
////    var multi = Array(Array(2, 1, 1), Array(3, 2, 1))
////
////    for(i <- multi; j <- i) {
////      println(j)
////    }
//
////      var arr = Array(2, 3, 1, 2)
////      var total = 0;
////
////      for(value <- arr) {
////        total += value;
////      }
////
////      println(total)
//
////    println(strToLen(Some("aqib")))
//
////    testOption("aqib", 1, Some("javed"))
////    testOption("ali", 2, null);
//
////    var arr = new Array[Int](3)
////    println(arr(0))
////
////    var arr1 = Array(0, 1, 2)
////    println(arr1(0))
//
//    //    var t = (1, true, "ali")
////    println(t._1)
////    var value = "aqib";
////    println(value.substring(1));
////    var list = List(1, 2, 3, 4, 5)
////    for(i <- 1 to 10) {
////      println(hello("" + i))
////    }
//
//
////    println(funImpl(5, i => String.valueOf(i)))
//  }
//
//
//  def funImpl(num : Int, fn : Int => String) = fn(num)
//
//
//  def hello(name : String = "A") : String = "Hello " + name
//
//
//
//  def strToLen(str : Option[String])  =  {
//     str.map(_.length).getOrElse(-1);
//  }
//
//  def testOption(name : String, id : Int, lastName : Option[String])  = {
//    lastName match {
//        case Some(lastName) => println(s"Hello $name $lastName")
//        case None => println("Nothing found")
//    }
//  }
//}
