package com.jyothika.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        // sorted array
        int[] arr = {-10, -7, 0, 1, 3, 5, 12, 26, 47, 48, 59, 93};
        int target = -110;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        // if start > end -> element not found
        while(start <= end) {
            // middle element
//            int mid = (start + end) / 2; // there is a chance that (start + end) value exceeds the range of integer.
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                // found the ans
                return mid;
            }
        }

        return -1;
    }
}
