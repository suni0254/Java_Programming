package recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(xPowerN(n, x));

//        printNumbers(n);
//
//        System.out.println(sumOfNaturalNumbersUsingRecursion(n));
//        System.out.println(factorialUsingRecursion(n));

//        int i = 1;
//        int sum = 1;
//        int temp = 0;
//        fibonacciUsingRecursion(n, i, sum, temp);
//    }

//    public static void printNumbers(int n) {
//        if(n == 6) {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(++n);
//    }
//
//    public static int sumOfNaturalNumbersUsingRecursion(int n) {
//        if(n==0) {
//            return 0;
//        }
//        return n + sumOfNaturalNumbersUsingRecursion(n-1);
//    }
//
//    public static int factorialUsingRecursion(int n) {
//        if (n==0) {
//            return 1;
//        }
//        return n*factorialUsingRecursion(n-1);
//    }

//    public static void fibonacciUsingRecursion(int n, int i, int sum, int temp) {
//        if(i>n){
//            return;
//        }
//        System.out.println(sum);
//        int total = sum + temp;
//        fibonacciUsingRecursion(n, ++i, total, sum);
//
//    }
    }

    public static int xPowerN(int n, int x) {
        if(n==0){
            return 1;
        }
       return x * xPowerN(n-1, x);
    }
}
