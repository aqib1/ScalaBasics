package com.example.scala
package datastructure

import scala.annotation.tailrec

trait Node[A] {
  def head: A
  def tail: Node[A]
  def add(head: A): Node[A] = Construct(head, this)
  def isEmpty: Boolean
}

case class Empty[A]() extends Node[A] {
  override def isEmpty: Boolean = true
  override def head: A = throw new NoSuchElementException
  override def tail: Node[A] = throw new NoSuchElementException
  override def toString: String = "[]"
}

case class Construct[A](head: A, tail: Node[A]) extends Node[A] {
  override def isEmpty: Boolean = false

  override def toString: String = {
    @tailrec
    def constructString(remaining: Node[A], acc: String): String = {
      if(remaining.isEmpty) return acc

      constructString(remaining.tail, s"$acc, ${remaining.head}")
    }


     s"[${constructString(this.tail, s"$head")}]"
  }
}
object TestApp extends App {
  val empty = Empty[String]().add("aq")
  println(empty)
}
