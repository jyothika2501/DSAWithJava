package com.jyothika.methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // sum();
        String name = "jyothika";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "chandu"; //creating a new object
    }

    private static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of two numbers is" +sum);
        return sum;
    }
}

/*
return_type name() {
//body
return statement
}
 */
