package javaPractice;

import java.util.Scanner;

public class Loops {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sumOfNaturalNumber = 0;

        for (int i = 1; i <= 10; i++)

            System.out.println(n + " x " + i + " = " + n * i);


        int i = 1;
        while (i <= n) {

            sumOfNaturalNumber = sumOfNaturalNumber + i;

            i++;

        }

        System.out.println(sumOfNaturalNumber);

        do {

            System.out.println(sumOfNaturalNumber);

            --sumOfNaturalNumber;

        }

        while (sumOfNaturalNumber > 0);

    }
}