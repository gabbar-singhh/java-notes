package com.FunctionsAndMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        🔴 QUES 1: Take input of two number and print the sum

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }
}
