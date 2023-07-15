package com.FunctionsAndMethod;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int ans = sum2();
        System.out.println(ans);
    }

/*
access modifier (we'll look in OOP) return_type name (){
//body
return statement;
}
 */

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }


    // return type in int (num1+num2)
    static int sum2() { // for return String, use "String" instead of "int"
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
