package com.palverse;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter some input: ");
        int roll_no = input.nextInt();
        /* next(), nextFloat()*/

        System.out.println("Your roll number is " + roll_no);


        int a = 10;
//        THEORY:
//        Here a (reference variable) is also called IDENTIFIER & 10 is called LITERALS.
//        LITERALS: Are the syntactical representation of like boolean, numeric, characters.

//        QUES: 234000000 million, how to declare it in a variable
        int million = 234_000_000; //instead of comma(,), use underscore (_)


    }
}
