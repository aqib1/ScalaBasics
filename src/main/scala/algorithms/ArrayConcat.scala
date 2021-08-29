package com.example.scala
package algorithms

import java.util
import scala.annotation.tailrec

object ArrayConcat {
  def getConcatenation(nums: Array[Int]): Array[Int] = {
      val result = new Array[Int](nums.length * 2)
      getConcatenation(nums, result, 0, result.length)
  }

  @tailrec
  def getConcatenation(nums: Array[Int], result: Array[Int], start: Int, end: Int): Array[Int] = {
    if(start >= end) return result
    result(start) = nums(start % nums.length)
    getConcatenation(nums, result, start + 1, end)
  }

  def main(args: Array[String]): Unit = {
    println(util.Arrays.toString(getConcatenation(Array[Int](1, 2))))
  }
}
