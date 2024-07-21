package com.jyothika.sorting;

// https://leetcode.com/problems/missing-number/
// Amazon Question
public class CyclicSortQuestions {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int correctIndex = nums[i]; // since starting from 0
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for first missing number
        for(int i=0; i<nums.length; i++) {
            // after sorting element should be at its index
            if(nums[i] != i) {
                return i;
            }
        }
        // case 2 - if last element is not there in the array
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}