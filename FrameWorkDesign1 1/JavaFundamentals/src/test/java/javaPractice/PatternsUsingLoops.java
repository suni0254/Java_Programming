package javaPractice;

public class PatternsUsingLoops {

    public static void main(String args[]) {

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= 4; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

        int n = 3, m = 4;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= m; j++) {

                if (i == 0 || j == 0 || i == n || j == m) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }
            }

            System.out.println();
        }

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= (n - i); j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {

                if (j < (n - i)) {

                    System.out.print(" ");

                } else

                    System.out.print("*");

            }

            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

        int y = 1;
        for (int i = 1; i < 5; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(++y + " ");

            }

            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {

                    System.out.print(1 + " ");

                } else

                    System.out.print(0 + " ");

            }

            System.out.println();

        }
    }
}