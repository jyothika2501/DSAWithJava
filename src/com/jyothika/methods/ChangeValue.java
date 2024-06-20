package com.jyothika.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 5, 87, 90};
        change(arr);
        System.out.println(Arrays.toString(arr)); // prints [999, 3, 5, 87, 90]
    }

    private static void change(int[] nums) {
        nums[0] = 999; // if you make a change to the object via this ref variable then the original value also changes i.e same object changes
    }

}
