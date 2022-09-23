package Advanced.MultidimensionalArrays.Excersise;

import java.util.Scanner;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        for (int r = 0; r < matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length; c++) {

                char c1 =(char)(97 + r);
                char c2 =(char)(97 + r + c);
                char c3 =(char)(97 + r);

                String result = String.format("%c%c%c",c1,c2,c3);
                matrix[r][c] = result;
            }
        }

        print(matrix);


    }

    private static void print(String[][] matrix) {
        for (String[] ints : matrix) {
            for (String anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
