package javaPractice;

public class AdvancePatterns {

    public static void  main(String args[]) {

        int n=4, x=6, y=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=0; j<n-i; j++) {
                System.out.print("    ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int m=0;
        for (int i=4; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j<=(n-i); j++) {
                System.out.print("    ");
                m++;
            }
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i=4; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=5; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(x-i); j++) {
                System.out.print(x-i + " ");
            }

            System.out.println();
        }

        for(int i=1; i<=y; i++) {
            for(int j=0; j<=(y-i); j++) {
                System.out.print("  ");
            }
            for(int j=0; j<i; j++) {
                System.out.print(i-j + " ");

            }
            for(int j=1; j<=i-1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }

        int k=5;
        for(int i=4; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < k - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= k - i - 1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }


        for(int i=1; i<=k-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<k-i; j++) {
                System.out.print("* ");
            }
            for(int j=4; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
