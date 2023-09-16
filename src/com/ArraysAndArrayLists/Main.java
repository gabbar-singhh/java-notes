package com.ArraysAndArrayLists;

public class Main {
    public static void main(String[] args) {
//      QUES: WHAT IS ARRAY?
//      ANS: IT IS AN COLLECTION OF SINGLE DATA TYPE.

//        👉🏻 SYNTAX
//        datatype[] variable_name = new datatype[size]

        //🔴 QUES: STORE 5 ROLL NO.S
        int[] roll_no = new int[5];

//        or assign directly
        int[] roll_no2 = {23, 12, 34, 28, 11};

        int[] id; // declaration of array. id is getting defined in the stack
        id = new int[5]; //initialization: actually here object is being created in memory (heap)

        System.out.println(id[4]); // output: 0

        String[] name = new String[5];
        System.out.println(name[3]); // output: null
    }
}
