package com.example.scala.algorithms;

import java.util.Arrays;

public class ArrayConcatJava {

    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int [len * 2];

        for(int x=0; x<result.length; x++)
            result[x] = nums[x % len];

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[] {1, 2, 3})));
    }
}
