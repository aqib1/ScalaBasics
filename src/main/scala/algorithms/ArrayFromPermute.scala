package com.example.scala
package algorithms

import scala.annotation.tailrec

object ArrayFromPermute {

  def buildArray(nums: Array[Int]): Array[Int] = {
    val result = new Array[Int](nums.length)
    buildArray(nums, result, 0)
  }

  @tailrec
  def buildArray(nums: Array[Int], result: Array[Int], start: Int): Array[Int] = {
    if(start >= result.length) return result
    result(start) = nums(nums(start))
    buildArray(nums, result, start + 1)
  }
  def main(args: Array[String]): Unit = {

  }
}
