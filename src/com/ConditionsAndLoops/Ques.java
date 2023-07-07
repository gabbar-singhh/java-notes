package com.ConditionsAndLoops;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        🔴 QUES 1: TELL WHICH IS THE LARGEST NUMBER AMONG ALL

//        👉 SOL:1
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);

//        👉 SOL:2
        int maxValue = Math.max(c, Math.max(a, b));
        System.out.println(maxValue);


//    🔴 QUES 2: CASE CHECK

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }


    }
}
