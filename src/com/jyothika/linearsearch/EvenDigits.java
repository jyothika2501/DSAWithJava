package com.jyothika.linearsearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, 1724, 98, 0};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        // 2 ways - count number of digits aor convert number into string and take length
        int numberOfDigits = digits(num);
        /* if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
        */
        return numberOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
