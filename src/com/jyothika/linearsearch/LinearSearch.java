package com.jyothika.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50, 90, 105, 76};
        System.out.println(linearSearch(arr, 105));
    }
    static int linearSearch(int[] arr, int element) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
