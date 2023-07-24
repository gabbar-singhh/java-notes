package com.FunctionsAndMethod;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 783, 23);
        multiple(2, 3, "wewe", "lolo", "rofl");
    }

    static void multiple(int a, int b, String... v) { // VARIABLE-LENGTH-ARG should always come at end!

    }

    static void fun(int... v) { // 🔴 Variable Length Argument
        System.out.println(Arrays.toString(v));
    }
}
