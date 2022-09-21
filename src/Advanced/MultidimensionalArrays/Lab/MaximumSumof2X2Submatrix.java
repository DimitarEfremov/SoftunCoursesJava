package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] [] matrix = getMatrix(scanner);

        int sum = Integer.MIN_VALUE;
        int [] [] matrixOfSum = new int[2][2];

        for (int i = 0; i < matrix.length - 1 ; i++) {
            for (int j = 0; j <matrix[i].length - 1 ; j++) {

                int number1 = matrix[i][j];
                int number2 = matrix[i][j + 1];
                int number3 = matrix[i + 1][j];
                int number4 = matrix[i + 1][j + 1];

                if ((number1+number2+number3+number4) > sum ){
                    sum = number1+number2+number3+number4;

                    matrixOfSum[0][0] = number1;
                    matrixOfSum[0][1] = number2;
                    matrixOfSum[1][0] = number3;
                    matrixOfSum[1][1] = number4;

                }

            }
        }

        for (int[] arrays : matrixOfSum) {
            for (int i : arrays) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println(sum);


    }

    private static int[][] getMatrix(Scanner scanner) {
        int [] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int [] [] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i <dimensions[0] ; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
