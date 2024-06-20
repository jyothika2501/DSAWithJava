package com.jyothika.methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        int num = 2;
        while( num * num <= n) {
            if(n % num == 0) {
                return false;
            }
            num++;
        }
        return true;
    }
}
