package com.springboot.demo.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10,2,4,3,5,7,6,9,8,1};

        int length = nums.length;
        int temp = 0;
        for (int i=0; i<length; i++) {
            for (int j=0; j<length-1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int temp1:nums)
            System.out.println(temp1);
    }
}
