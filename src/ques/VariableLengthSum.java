package ques;

import java.util.Arrays;

public class VariableLengthSum {

    public static void main(String[] args) {
        addIntegers(11, 10, 9);
    }

    static int addIntegers(int... num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        return res;
    }
}
