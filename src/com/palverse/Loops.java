package com.palverse;

public class Loops {
    public static void main(String[] args) {

//        IF-ELSE CONDITION
        int a = 20;
        if (a == 10) {
            System.out.println("Value of a is 10");
        } else {
            System.out.println("Value of a is not 10");
        }

//      DO-WHILE LOOPS
        int count = 1;

        while (count != 5) {
//            System.out.println(count);
            count++;
        }

//        FOR LOOPS
        for (int num = 1; num != 5; num++) {
            System.out.println(num);
        }
    }
}
