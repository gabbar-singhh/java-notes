package com.SwitchStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String fruit = input.next();

// DONT USE THIS ❌😵
        /*
        if (fruit.equals("mango")) {
            System.out.println("KING OF THE FRUITS 👑");
        }
        if (fruit.equals("apple")) {
            System.out.println("A SWEET RED FRUIT 🍎");
        }
         */


//       👇  USE SWITCH STATEMENTS 😁✅
//        OLD SWITCH SYNTAX 👴
        /*
        switch (fruit) {
            case "Mango":
                System.out.println("KING OF FRUIT");
                break;

            case "Apple":
                System.out.println("A SWEET RED FRUIT");
                break;

            case "Orange":
                System.out.println("ROUND FRUIT");
                break;
            case "Grapes":
                System.out.println("Small Fruits");
                break;
            default:
                System.out.println("PLS ENTER A VALID FRUIT :D");
        }
         */

//        NEW SWITCH SYNTAX 👶 (BREAK CONDITIONS-INTERNALLY)
        /*
        switch (fruit) {
            case "Mango" -> System.out.println("KING OF FRUIT");
            case "Apple" -> System.out.println("A SWEET RED FRUIT");
            case "Orange" -> System.out.println("ROUND FRUIT");
            case "Grapes" -> System.out.println("Small Fruits");
            default -> System.out.println("PLS ENTER A VALID FRUIT :D");
        }
         */

        int day = input.nextInt();
        switch (day) {
            case 1 -> {
//                CAN ALSO USE MULTI-LINE CODE BY ADDING A BRACKETS
                System.out.println("Monday");
            }
            case 2 -> System.out.println("Tues");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thurs");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");

        }

//ALSO (Break Conditions)
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday!");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
        }

    }
}
