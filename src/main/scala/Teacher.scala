package com.example.scala

class Teacher (override val name: String) extends Person(name) {

  override def calculateAge(age: Int): Int = Math.abs(age)
  override def toString: String = s"Teacher is connected with $name"
}
