import java.util.Scanner;

public class PrimeNumber {
    //13th Number is prime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number <= 1) {
            System.out.println("Number is not a prime");
            return;
        }

        boolean isPrime = true;
        for(int i=2; i * i <=number; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not a prime");
        }
    }
}
