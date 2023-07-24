package com.FunctionsAndMethod;

public class OverLoading {
    public static void main(String[] args) {
        fun(67);
        fun("codexhimanshu");
        fun("Himanshu", "Pal");
    }

    //    METHOD WITH SAME FUNCTION CAN EXIST, ONLY IF -DIFFERENT TYPE ARGUMENT OR -DIFFERENT NUM OF ARGUMENT
    static void fun(String a, String b) {
        System.out.println(a + b);
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
