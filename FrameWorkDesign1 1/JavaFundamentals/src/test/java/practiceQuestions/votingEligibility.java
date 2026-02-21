package practiceQuestions;

import java.util.Scanner;

public class votingEligibility {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 18) {

            System.out.println("He/She can vote");

        } else if (age > 0 && age < 18) {

            System.out.println("He/She cannot vote");

        } else {

            System.out.println("invalid age");
        }
    }
}
