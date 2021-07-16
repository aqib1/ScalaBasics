package com.example.scala

class Person (val name : String) {

  def calculateAge(age: Int): Int = age + 1;
  override def toString: String = s"Person is connected with $name"
}
