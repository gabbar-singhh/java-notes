package com.ConditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*        FOR-LOOPS                         */
//        QUES: Print number from 1 to 5
        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
        }

//        QUES: Print numbers from 1 to n
//
//        int n = input.nextInt();
//
//        for (int i = 0; i <= n; i++) {
//            System.out.println(i);
//        }

        /*WHILE LOOP*/
//        QUES: Print number from 1 to 5

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

//        WHEN TO USE WHICH LOOP
//        WHILE LOOP: When we don't know how many times a loop should run
//        FOR LOOP: When we know how many times a loop should run



        /*DO-WHILE LOOP*/

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

        /*ENHANCED FOR-LOOP (ONLY FOR ARRAY)*/
        System.out.println("🟡 ENHANCED FOR-LOOP (ONLY FOR ARRAY)");
        int[] arr = {23, 45, 678, 345, 23};

        for (int j : arr) {
            System.out.println(j + " ");

        }

    }
}
