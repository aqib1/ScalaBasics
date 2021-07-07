package com.example.scala

import java.util.{Arrays, UUID}

object TwoSum extends App {

  println(UUID.randomUUID().toString)
  println(Arrays.toString(twoSum(Array(3, 3), 6)))

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var indexByNumber: Map[Int, Int] = Map()
    val result = new Array[Int](2)
    nums.zipWithIndex.foreach{case (item, index) =>
      val diff = target - item
      if(indexByNumber.contains(diff) && index != indexByNumber.getOrElse(diff, -1)) {
        return Array(indexByNumber.getOrElse(diff, -1), index)
      } else
      indexByNumber += (item -> index)
    }

    result
  }
}
