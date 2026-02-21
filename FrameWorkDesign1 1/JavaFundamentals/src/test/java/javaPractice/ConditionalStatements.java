package javaPractice;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18) {

            System.out.println("He/She is an adult");

        } else {

            System.out.println("He/She is not an adult");

        }

        if (age == 0) {

            System.out.println("invalid age");

        } else if (age % 2 == 0) {

            System.out.println("age is even");

        } else {

            System.out.println("age is odd");

        }

        String greetings = scanner.nextLine();

        switch (greetings) {

            case "hi":
                System.out.println("greetings is in english");
                break;

            case "Maya":
                System.out.println("greetings is in Telugu");
                break;

            case "Salaam":
                System.out.println("greetings is in Arabic");
                break;

            default:
                System.out.println("Invalid greeting");

        }

        scanner.close();
    }
}