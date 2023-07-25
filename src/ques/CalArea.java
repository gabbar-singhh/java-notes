package ques;

public class CalArea {
    //    circle | rectangle | triangle

    //    AREA OF CIRCLE
    static double findArea(int radius) {
        return (3.14 * radius * radius);
    }

    //    AREA OF RECTANGLE
    static float findArea(float length, float breadth) {
        return (length * breadth);
    }

    static double findArea(double base, double height) {
        return 1 / 2 * base * height;
    }

    public static void main(String[] args) {
        System.out.println(findArea(5));
    }
}
