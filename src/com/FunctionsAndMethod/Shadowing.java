package com.FunctionsAndMethod;

public class Shadowing {
    static int x; //THIS WILL BE SHADOWED (Will be Overwritten by lower blocks  )

    public static void main(String[] args) {

//        🔴 SHODOWING
        int x = 40; // the class variable at line 4 is shodowed by this;

        System.out.println(x);


    }
}
