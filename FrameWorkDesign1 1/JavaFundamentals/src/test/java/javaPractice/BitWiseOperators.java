package javaPractice;

import java.util.Scanner;

public class BitWiseOperators {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        System.out.println("Enter the position pos: ");
        int pos = sc.nextInt();
        convert2Binary(n);

        if(powerOf2(n)) {
            System.out.println(n + " is power of 2");
        }

        System.out.println(toggleBit(n, pos));

        System.out.println("Number of 1's in " + n + " is: " + noOfones(n));


        binaryTODecimal(decimalToBinary(n).toString());

    }

    public static void convert2Binary(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0) {

            sb.insert(0,n%2);
            n /=2;
        }
        System.out.println(sb);
    }

    public static boolean powerOf2(int n) {

        return n>0 && ((n & n-1) ==0);
    }

    public static int toggleBit(int n, int position) {
        int bitMask= 1<<position;

        return n ^ bitMask;
    }

    public static int noOfones(int n) {
        int count = 0;
        while(n>0) {
            count = count + (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static StringBuilder decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();

        System.out.println("The binary value of " + n + " is: " + Integer.toBinaryString(n));

        while(n>0) {
            sb.insert(0, n % 2);
            n = n / 2;
        }
        System.out.println("The binary value of given number is: " + sb);

        return sb;
    }

    public static void binaryTODecimal(String binary) {

        System.out.println("The decimal value of " + binary + " is: " + Integer.parseInt(binary, 2));
    }
}
