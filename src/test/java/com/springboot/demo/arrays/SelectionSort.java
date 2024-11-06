package com.springboot.demo.arrays;

public class SelectionSort {
    /**
     * Main method to perform selection sort on an array of integers.
     * The sorted array will be printed to the console.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] nums = {10, 2, 4, 3, 5, 7, 6, 9, 8, 1};

        int length = nums.length;
        int temp = 0;

        // Iterate over each element in the array
        for (int i = 0; i < length; i++) {
            // Initialize the minimum index as the current index
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        // Print the sorted array
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
