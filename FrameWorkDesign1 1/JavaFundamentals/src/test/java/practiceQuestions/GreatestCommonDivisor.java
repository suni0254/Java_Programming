package practiceQuestions;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = 1;
        for(int i=1; i<=Math.min(a,b); i++) {
            if ((a % i) ==0 && (b % i) ==0) {
                GCD = i;
            }
        }
        System.out.println("The GCD of " + a +"," + b + " is : " + GCD);
        System.out.println("The GCD of " + a +"," + b + " is : " + gcdOfNumbers(a, b));
    }

    public static int gcdOfNumbers(int a, int b) {
        while(b !=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int GCD = a;

        return GCD;
    }

}
