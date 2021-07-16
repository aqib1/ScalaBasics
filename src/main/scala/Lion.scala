package com.example.scala

class Lion extends Animal with Carnivores {

  override def food(): String = s"$name will eat meat because its a carnivores"

  def eat(food: String) : Unit = println(s"Lion is eating $food")

  override val name: String = "Lion"

  override val foodSpecial: String = "hajkh"

  override def eatMeat(): String = "Eating some meat"
}
