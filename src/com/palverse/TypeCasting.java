package com.palverse;

public class TypeCasting {
    public static void main(String[] args) {
//        CONDITIONS FOR AUTOMATICALLY TYPE-CASTING
//        - Two types should be compatible
//        - Destination type should be greater than the source type (Float >> Int)

//        TYPE-CASTING: CONVERT FLOAT INTO INT
        int num = (int) (34.74F);
        System.out.println(num);

//        AUTOMATIC TYPE PROMOTION IN EXPRESSION
        int a = 257;
        byte b = (byte) (a); // 1 byte = 256

        System.out.println(b);  // 257 % 256 = 1


        byte x = 40;
        byte y = 50;
        byte z = 100;

        int res = x * y / z;

        System.out.println(res);

        int number = 'A';
        System.out.println("number " + number); // will output it's ASCII value of 'A'
        System.out.println("नमस्ते");
    }
}
