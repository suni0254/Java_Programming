package practiceQuestions;

import java.util.Scanner;

public class SumOfAllOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(printSumOfAllOddNumbers(number));
    }

    public static int printSumOfAllOddNumbers(int number) {

        int i=1;
        int sum=0;
        while(i<=number) {

            if(i%2 !=0) {
                sum = sum+i;

            }
            i++;
        }
        return sum;
    }
}
