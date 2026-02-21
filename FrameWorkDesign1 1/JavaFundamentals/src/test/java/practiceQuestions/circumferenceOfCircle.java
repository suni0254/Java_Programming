package practiceQuestions;

import java.util.Scanner;

public class circumferenceOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        System.out.println(circumference(radius));
    }

    public static double circumference(double radius) {

        double circumference = 2 * 3.14 * radius;

        return circumference;
    }
}
