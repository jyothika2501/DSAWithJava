package com.jyothika.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        // if return type is void.
        //bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i<arr.length; i++) {
            swapped = false;
            // for each step the max element comes at last respective index
            for(int j=1; j<arr.length-i; j++) {
                // swap if the element is smaller than the previous element
                if(arr[j] < arr[j-1]) {
                    //swap
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped) {
                //swapped becomes true only if it goes into j for loop
                System.out.println("Array is already sorted, skipping all the swapping iterations at that iteration");
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
