package practiceQuestions;

import java.util.Scanner;

public class GreaterOfTwoNumbers {

    public static void main(String[] args) {

        GreaterOfTwoNumbers greaterOfTwoNumbers = new GreaterOfTwoNumbers();
        Scanner sc = new Scanner(System.in);

        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        System.out.println("The greater number is: " + greaterOfTwoNumbers.greaterOfTwoNumbers(number1, number2));
    }

    public double greaterOfTwoNumbers(double number1, double number2) {
        double result = 0;
        if(number1 > number2) {
            result = number1;
        }
        else if (number2 > number1) {
            result = number2;
        }
        else
            result = number1;

        return result;
    }


}
