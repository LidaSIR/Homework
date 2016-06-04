package com.HomeTasks.week2;

import utils.ArrayUtils;

/**
 * Created by Lida on 02.06.2016.
 */
//Given an array of ints, return the sum of the first 2 elements in the array.
// If the array length is less than 2, just sum up the elements that exist,
// returning 0 if the array is length 0.
public class TestForCodingbad {
    public static void main(String[] args) {
        int[] nums = new int[3];

        ArrayUtils.printArray(nums);
        System.out.println();

        if(nums.length >= 2){
          int sum = nums[0] + nums[1];
            System.out.println(sum);
        }
        if (nums.length < 2){
            int sum = nums[0];
            System.out.println(sum);
        }
        if (nums.length == 0){
            int sum = 0;
            System.out.println(sum);
        }



    }
}
