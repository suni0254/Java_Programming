package javaPractice;

import java.util.Scanner;

public class FactorialFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int factorialResult = factorial(number);

        System.out.println(factorialResult);

        fibonacci(number);

    }


    public static int factorial(int number) {

        int temp = number;

        int result = 1;

        while (temp > 0) {

            result = result * temp;
            temp--;

        }
        return result;
    }

    public static int fibonacci(int number) {
        int firstNumber = 0;
        int secondNumber = 1;

        int result =0;

        while(number > 0) {
            System.out.println(firstNumber);

            result = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = result;
            number--;

        }
        return result;
    }

}

