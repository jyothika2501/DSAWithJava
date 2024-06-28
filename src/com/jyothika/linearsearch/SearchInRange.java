package com.jyothika.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {12, 3, 4, 56, 78, 90,52};
        int target1 = 4;
        System.out.println(search(nums, target1, 1, 4)); // returns the index of the target if it si found
    }
    static int search(int[] arr, int target1, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            // check for element at every index if it is present nd equals to target
            if(arr[index] == target1) {
                return index;
            }
        }
        return -1;
    }
}
