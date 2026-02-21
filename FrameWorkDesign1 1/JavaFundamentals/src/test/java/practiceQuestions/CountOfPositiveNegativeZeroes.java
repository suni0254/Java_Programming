package practiceQuestions;

import java.util.Scanner;

public class CountOfPositiveNegativeZeroes {

    //private static Scanner sc = new Scanner(System.in);

//    protected static int totalPositiveNumbers;
//    private static int sumOfPositiveNumbers;
//    private static int totalNegativeNumbers;
//    private static int sumOfNegativeNumbers;
//    private static int noOfZeroes;
//
//
//    public static void main(String[] args) {
//
//        System.out.print("Enter any number: ");
//        int number = sc.nextInt();
//        addAllNumbers(number);
//
//        System.out.println("No of Positive Numbers: " + totalPositiveNumbers);
//        System.out.println("Sum of Positive Numbers: " + sumOfPositiveNumbers);
//        System.out.println("No of Negative Numbers: " + totalNegativeNumbers);
//        System.out.println("Sum of Negative Numbers: " + sumOfNegativeNumbers);
//        System.out.println("No of Zeroes: " + noOfZeroes);
//
//
//
//    }
//
//
//    public static void getNumber() {
//
//        System.out.print("Type any number: ");
//        int number = sc.nextInt();
//        addAllNumbers(number);
//
//
//    }
//
//    public static void Loop() {
//
//        System.out.print("Do you want to add more: Yes/No: ");
//        String answer = sc.next();
//        switch (answer.toLowerCase()) {
//
//            case "yes":
//                getNumber();
//                break;
//
//            case "no":
//                break;
//        }
//    }
//
//    public static void addAllNumbers(int number) {
//
//        if (number > 0) {
//            totalPositiveNumbers++;
//            sumOfPositiveNumbers = sumOfPositiveNumbers + number;
//
//        } else if (number < 0) {
//            totalNegativeNumbers++;
//            sumOfNegativeNumbers = sumOfNegativeNumbers + number;
//
//        } else
//            noOfZeroes++;
//
//        Loop();
//    }

    static int totalPositiveNumbers;
    static int sumOfPositiveNumbers;
    static int totalNegativeNumbers;
    static int sumOfNegativeNumbers;
    static int noOfZeroes;


    public static void main(String[] args) {

        String answer;
        do {
            System.out.println("Enter any number: ");

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            addAllNumbers(number);

            System.out.println("Do you want to add more numbers, yes/no: ");
            answer = sc.next();
            switch (answer) {
                case "yes":
                    break;

                case "no":
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }
        }
        while (answer.equalsIgnoreCase("Yes"));

        System.out.println("No of Positive Numbers: " + totalPositiveNumbers);
        System.out.println("Sum of Positive Numbers: " + sumOfPositiveNumbers);
        System.out.println("No of Negative Numbers: " + totalNegativeNumbers);
        System.out.println("Sum of Negative Numbers: " + sumOfNegativeNumbers);
        System.out.println("No of Zeroes: " + noOfZeroes);

    }

        public static void addAllNumbers(int number) {
            if (number > 0) {
            totalPositiveNumbers++;
            sumOfPositiveNumbers = sumOfPositiveNumbers + number;

        } else if (number < 0) {
            totalNegativeNumbers++;
            sumOfNegativeNumbers = sumOfNegativeNumbers + number;

        } else
            noOfZeroes++;
    }
}
