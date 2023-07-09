package com.ConditionsAndLoops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  🔴 QUES 1: TELL WHICH IS THE LARGEST NUMBER AMONG ALL

//        👉 SOL:1
        /*
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);
         */

//        👉 SOL:2
        /*
        int maxValue = Math.max(c, Math.max(a, b));
        System.out.println(maxValue);
         */


//    🔴 QUES 2: CASE CHECK

        /*
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
         */

//        🔴 QUES 3: (FIBONACCI NUMBERS) FIND THE nTH Fibonacci Numbers

        /*
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n) {

            int temp = b;

            b = b + a;

            a = temp;

            count++;
        }
        System.out.println(b);
         */

        //        🔴 QUES 4: Counting Occurrences
/*
        int n = 336574513;
        int x = 3;
        String number = String.valueOf(n);

        int count = 0;
        for (int i = 0; i < number.length(); i++) {

            int element = Integer.parseInt(String.valueOf(number.charAt(i)));

            if (element == x) {
                count++;
            }

        }

        System.out.println(count);
 */

        //        🔴 QUES 5: Reverse Number


    }
}
