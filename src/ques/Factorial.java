package ques;

public class Factorial {
    //        🔴 FIND FACTORIAL OF Nth INTEGER;
    public static int findFactorial(int num) {
        int factorial = 1;

        if (num < 1) {
            System.out.println("Number should be Integer & Greater than 1");
        } else {

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }

        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        int result = findFactorial(num);
        System.out.println(result);
    }
}
