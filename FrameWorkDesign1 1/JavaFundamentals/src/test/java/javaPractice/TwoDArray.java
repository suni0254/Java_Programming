package javaPractice;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        tranpose();

//        Scanner sc = new Scanner(System.in);
//
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//
//        int numbers[][] = new int[row][column];
//
//        for(int i=0; i<row; i++) {
//            for(int j=0; j<column; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<row; i++) {
//            for(int j=0; j<column; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

//        Scanner sc = new Scanner(System.in);
//
//        int rowSize = sc.nextInt();
//        int columnSize = sc.nextInt();
//
//        int numbers[][] = new int[rowSize][columnSize];
//
//        for (int i = 0; i < rowSize; i++) {
//
//            for (int j = 0; j < columnSize; j++) {
//
//                numbers[i][j] = sc.nextInt();
//
//            }
//        }
//
//        int firstRow = 0;
//        int lastRow = rowSize - 1;
//        int firstColumn = 0;
//        int lastColumn = columnSize - 1;
//
//        while (firstRow <= lastRow && firstColumn <= lastColumn) {
//
//            for (int col = firstColumn; col <= lastColumn; col++) {
//
//                System.out.print(numbers[firstRow][col] + " ");
//            }
//
//            firstRow++;
//
//            for (int row = firstRow; row <= lastRow; row++) {
//
//                System.out.print(numbers[row][lastColumn] + " ");
//            }
//
//            lastColumn--;
//
//
//            if (firstRow <= lastRow) {
//                for (int col = lastColumn; col >= firstColumn; col--) {
//
//                    System.out.print(numbers[lastRow][col] + " ");
//                }
//            }
//
//            lastRow--;
//
//            if (firstColumn <= lastColumn) {
//                for (int row = lastRow; row >= firstRow; row--) {
//
//                    System.out.print(numbers[row][firstColumn] + " ");
//                }
//            }
//
//            firstColumn++;
//        }

    }
    public static void tranpose() {

        Scanner sc = new Scanner(System.in);

        int rowSize = sc.nextInt();
        int columnSize = sc.nextInt();

        int numbers[][] = new int[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {

            for (int j = 0; j < columnSize; j++) {

                numbers[i][j] = sc.nextInt();

            }
        }

        int newMatrix[][] = new int[columnSize][rowSize];

        for(int i=0; i<rowSize; i++) {
            for(int j=0; j<columnSize; j++) {
                newMatrix[j][i] = numbers[i][j];
            }
        }

        for(int i=0; i<columnSize; i++) {
            for(int j=0; j<rowSize; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
