package com.FunctionsAndMethod;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValueArray {

    //    🔴 VALUE OF ARRAY NUM AT 0 WILL CHANGE ✅
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        System.out.println("🧡num " + Arrays.toString(num));
        changeVal(num);
        System.out.println("🦴num " + Arrays.toString(num));
    }

    static void changeVal(int[] val) {
        val[0] = 23;
    }
}
