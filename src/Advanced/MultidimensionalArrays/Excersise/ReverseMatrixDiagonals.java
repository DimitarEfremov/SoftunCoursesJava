package Advanced.MultidimensionalArrays.Excersise;

import java.util.List;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];


        for (int i = 0; i <rows ; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }


        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {

                if (isInBounds(matrix, rows - 1 - j, cols - 1 + j - i )){
                    System.out.print(matrix[rows - 1 - j][cols - 1 + j - i ] + " ");
                }

            }
            System.out.println();
        }

        for (int i = 0; i < rows - 1; i++) {
            int n = 0;
            for (int j = rows - 1 - i; j > 0 ; j--) {

                if (isInBounds(matrix ,j-1, n ))
                System.out.print(matrix[j-1][n]  + " ");
                n++;
            }
            System.out.println();
        }


        System.out.println();
    }

    private static boolean isInBounds(String[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 &&  j < matrix[0].length;
    }
}
