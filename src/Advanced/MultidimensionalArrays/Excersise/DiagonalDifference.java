package Advanced.MultidimensionalArrays.Excersise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i <size ; i++) {
            matrix[i] = getArray(scanner);
        }

        int primeDiagonal = primeDiagonal(matrix);
        int secondaryDiagonal = secondaryDiagonal(matrix);

        System.out.println(Math.abs(primeDiagonal-secondaryDiagonal));


    }

    private static int primeDiagonal(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length ; row++) {
                    sum+=matrix[row][row];
        }
        return sum;
    }

    private static int secondaryDiagonal(int[][] matrix) {
        int row = 0;
        int col = matrix[row].length - 1;
        int sum = 0;

        while (row < matrix.length && col < matrix[row].length){
            sum += matrix[row][col];
            row++;
            col--;
        }
        return sum;
    }

    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
