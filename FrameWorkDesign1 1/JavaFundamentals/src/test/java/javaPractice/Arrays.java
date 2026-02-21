package javaPractice;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

//        String bewarse[] = {"Sai", "Datta", "Pawan", "Lakshman", "Imran"};
//
//        for(int i=0; i<bewarse.length; i++) {
//            System.out.println(bewarse[i]);
//        }
        //printArrays();
//        maximimAndMinimumValue();
        ascendingOrder();

    }
//    public static void printArrays() {
//        System.out.println("Mention array size: ");
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String bewarse[] = new String[size];
//
//        for(int i=0; i<size; i++) {
//            System.out.println("Name of person" + i);
//            bewarse[i] = sc.next();
//        }
//
//        for (int i=0; i<bewarse.length; i++) {
//            System.out.println(bewarse[i]);
//        }
//    }

//    public static void maximimAndMinimumValue() {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//
//        int numbers[] = new int[size];
//        numbers[0] = sc.nextInt();
//        int minimumNumber = numbers[0];
//        int maximumNumber = numbers[0];
//
//        for(int i=0; i<size; i++) {
//            System.out.println("Enter the number: " + i + " ");
//            numbers[i] = sc.nextInt();
//            if (minimumNumber > numbers[i]) {
//                minimumNumber = numbers[i];
//            }
//            else if(maximumNumber < numbers[i]){
//                    maximumNumber = numbers[i];
//            }
//        }
//        System.out.println("Minimum number is: " + minimumNumber);
//        System.out.println("Maximum number is: " + maximumNumber);
//    }

    public static void ascendingOrder() {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++) {
            System.out.println("Enter the number: " + (i+1) + " ");
            numbers[i] = sc.nextInt();
        }
        boolean ascending = true;
        for(int i=1; i<numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) {
                ascending = false;
                break;
            }
        }
        if(ascending) {
            System.out.println("Array is in ascending order");
        } else {
            System.out.println("Array is not in ascending order");
        }

        for(int i=0; i<numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
    }
}
