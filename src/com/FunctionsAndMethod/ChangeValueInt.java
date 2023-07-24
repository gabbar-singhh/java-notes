package com.FunctionsAndMethod;

public class ChangeValueInt {

    //    🔴 VALUE OF INT NUM WON'T CHANGE ❌
    public static void main(String[] args) {
        int num = 12;
        System.out.println("🧡num " + num);
        changeVal(num);
        System.out.println("🦴num " + num);

    }

    static void changeVal(int val) {
        val = 23;
    }
}
