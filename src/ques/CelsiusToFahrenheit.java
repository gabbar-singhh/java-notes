package ques;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println(celsiusToFahren(100));
    }

    private static float celsiusToFahren(float degree) {
        return (degree * 9 / 5) + 32;
    }
}
