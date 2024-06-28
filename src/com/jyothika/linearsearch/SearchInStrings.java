package com.jyothika.linearsearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Jyothika";
        char target = 'z';
        System.out.println(search(name, target)); // returns true if the character is present in the string
        // System.out.println(name.toCharArray()); // prints Jyothika
        // System.out.println(Arrays.toString(name.toCharArray())); // converts string into character array - [J, y, o, t, h, i, k, a]
    }
    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
