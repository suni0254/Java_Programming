package practiceQuestions;
import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("The value of x power n is:" + xPowerN(x, n));
    }

    public static int xPowerN(int x, int n) {
        int result = 1;
        for (int i=1; i<=n; i++) {
            result = result * x;
        }
        return result;
    }
}
