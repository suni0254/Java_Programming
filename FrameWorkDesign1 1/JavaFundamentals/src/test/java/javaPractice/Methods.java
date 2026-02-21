package javaPractice;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int number = sc.nextInt();

        int result = addTwoNumbers(a, b);

        int factorialOfNumber = factorial(number);
        System.out.println(result);
        System.out.println(factorialOfNumber);
    }

    public static int addTwoNumbers(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int factorial(int number) {
        int initialFactorialValue = 1;
        int temp = number-1;
        for(int i=0; i<temp; i++) {
          initialFactorialValue = number * (temp);
            temp=temp-1;
            number=initialFactorialValue;
        }
        return initialFactorialValue;
    }
}
