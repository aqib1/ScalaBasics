package com.example.scala


object OOP extends App {

  class test(val id: Integer,val name: String) {

    def this(name: String) = {
      this(0, name)
    }

    def this(id: Integer) = {
      this(id, "test")
    }

    def this() = {
      this(0)
    }
    def add(name: String): String = this.name.concat(name)

  }

val t =  new test()
  println(t.id)
  println(t add "ABC")

// abstract class Animal {
//   val food: String
//   def eat(): String
// }
//  trait Carnivoves {
//    def eat(animal: Animal)
//  }
//
// class Tiger extends Animal with Carnivoves {
//   override val food: String = "Meat"
//
//   override def eat(): String = this.food
//
//   override def eat(animal: Animal) = {
//     println("Eating animal")
//   }
// }
// class Horse extends Animal {
//   override def eat() = this.food
//
//   override val food: String = "Grass"
// }
//
//  val horse = new Horse
//  println(horse.food)
//
//  val tiger = new Tiger
//  tiger eat horse
//
// class HelloWorld {
//   def name(name : String): String = name
// }
//
//  val hello = new HelloWorld
//  println(hello name "Aqib")
//
//
//  class Dog(name: String) extends Animal {
//    override val food: String = "Dog food"
//
//    override def eat(): String = this.food
//
//    object Dog {
//      def apply(name : String) : String = name
//
//      def printName(): Unit =
//        println(name)
//
//    }
//  }
//  val dog = new Dog("Rex")
//  dog.Dog.printName()
//  println(dog.Dog("Test"))
//
//  val incrementalFn: (Int, Int) => Int = (v1: Int, v2: Int) => v1 + v2
//
//  println(incrementalFn(5, 3))
//
//
//  val newList: List[Int] = List(1, 2, 3).map(i => i+1).reverse
//  println(newList)
//
//  // flatmap is use to flatten your map
//
//  val flatMap: List[Int] = List(1, 2, 3).flatMap{ i =>
//    List(i, i * i) // this will generate list for each i and then flatmap will flatten
//  }
//
//  val flatMapWithFilter = List(1, 2, 3, 4, 5, 6).filter(_ <= 3)
//    .flatMap(number => List('a', 'b', 'c').map(l => s"$l - $number"))
//  println(flatMapWithFilter)
//
//
//  val aList = List(1, 2, 3, 4)
//  val head = aList.head
//  val tail = aList.tail
//  var appendedList =  5 :: aList
//  for (i <- 10 until 20) {
//     appendedList = appendedList :+ i
//  }
//
//  println(appendedList)
//
//  // ranges
//  val range: Range = 1 to 10
//  range.map(2 + _).foreach(println)
//
//  val sampleNumber: Int = 34
//   sampleNumber match  {
//    case 34 => println("Matching ...")
//    case _ => println("")
//  }
//
//  val customTuple = ("aqib", 1, 3.21)
//  val customTuple2 = ("aqib", "ali", 1, 2)
//
//  customTuple match {
//    case (a, b, c) => println("Working")
//    case _ =>
//  }
}
