package com.jyothika.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 6, 90, 56, 87, 23, 1, 76};
        System.out.println(linearSearch(arr, 87));
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
