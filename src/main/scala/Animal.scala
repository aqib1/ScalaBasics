package com.example.scala

abstract class Animal {
  val name: String
  def food(): String
  def foodSpecial : String = "Special"
}

