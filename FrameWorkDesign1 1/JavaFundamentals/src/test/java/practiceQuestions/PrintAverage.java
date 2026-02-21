package practiceQuestions;

import java.util.Scanner;

public class PrintAverage {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(printAverage(a, b, c));
    }

    public static float printAverage(int a, int b, int c) {
        float average = ((a+b+c)/3.0f);

        return average;
    }


}
