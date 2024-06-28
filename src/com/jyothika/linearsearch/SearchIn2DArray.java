package com.jyothika.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 5},
                {78, 99, 100},
                {18, 56, 12},
        };
        int target = 99;
        int[] ans = search(arr, target);  //format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row , col};  // in order to create a new object new int[]
                }
            }
        }
        return new int[]{-1, -1};
    }
}
