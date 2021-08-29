package com.example.scala.algorithms;

public class ArrayFromPermuteJava {
    public int[] buildArray(int[] nums) {
        int[] result = new int [nums.length];
        for(int x=0; x<result.length;x++)
            result[x] = nums[nums[x]];
        return result;
    }
}
