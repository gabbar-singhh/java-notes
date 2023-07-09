package com.SwitchStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empID = input.nextInt();
        String department = input.next();

//        NESTED SWITCH STATEMENT (OLD WAYS) 👴
        /*
        switch (empID) {
            case 1:
                System.out.println("Himanshu Pal");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT DEPARTMENT");
                        break;
                    case "MARKETING":
                        System.out.println("MARKETING DEPARTMENT");
                        break;
                    default:
                        System.out.println("NO DEPT ENTERED!");
                }
                break;
            default:
                System.out.println("Enter correct empID!");
        }
         */
//        NESTED SWITCH STATEMENT (NEW WAY) 👶
        switch (empID) {
            case 1 -> System.out.println("Himanshu Pal");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT DEPARTMENT");
                    case "MARKETING" -> System.out.println("MARKETING DEPARTMENT");
                    default -> System.out.println("NO DEPT ENTERED!");
                }
            }
            default -> System.out.println("Enter correct empID!");
        }
    }
}
