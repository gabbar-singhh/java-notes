package com.ArraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

//        TAKING USER INPUT & THEN ASSIGNING IT TO A VARIABLE!
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("🥵 " + Arrays.toString(arr));
    }
}