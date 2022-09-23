package Advanced.MultidimensionalArrays.Excersise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = dimensions[0];
        int col = dimensions[1];

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = 0;
        int result = Integer.MIN_VALUE;
        int[][] resultMatrix = new int[3][3];

        for (int r = 0; r < matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {

                if (isInBounds(matrix ,r ,c)){
                    sum = sum3X3(matrix ,r ,c);
                    if (sum>result){
                        result = sum;
                        resultMatrix = matrix3X3(matrix ,r ,c);
                    }
                }
            }
        }

        System.out.printf("Sum = %d%n",result);

        print(resultMatrix);

    }

    private static int sum3X3(int[][] matrix, int r, int c) {
       int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                sum += matrix[r + i][c + j];
            }
        }


        return sum;
    }

    private static int[][] matrix3X3(int[][] matrix, int r, int c) {
        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                resultMatrix[i][j] = matrix[r + i][c + j];
            }
        }

        return resultMatrix;
    }


    private static boolean isInBounds(int[][] matrix, int i, int j) {
        return i >= 0 && i + 2 < matrix.length && j >= 0 &&  j + 2 < matrix[i].length;
    }

    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
