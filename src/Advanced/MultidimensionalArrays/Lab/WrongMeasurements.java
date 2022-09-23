package Advanced.MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];


        for (int i = 0; i < matrix.length ; i++) {
            matrix[i] = getArray(scanner);
        }

        int [] toBeReplacedIndex = getArray(scanner);

        int valueToBeReplaced = matrix[toBeReplacedIndex[0]][toBeReplacedIndex[1]];

        List<int[]> correctValues = new ArrayList<>();



        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] == valueToBeReplaced){
                    int correctValue = getNearbySum (matrix,i,j, valueToBeReplaced);

                    correctValues.add(new int[]{i, j, correctValue});
                }

            }
        }

        for (int[] value : correctValues) {
            int row = value[0];
            int col = value[1];
            int correctNum = value[2];
            matrix[row][col] = correctNum;
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }

    private static int getNearbySum(int[][] matrix, int i, int j, int valueToBeReplaced) {
        int sum = 0;

        if (isInBounds(matrix,i +1, j ) &&  matrix[i + 1][j] != valueToBeReplaced){
            sum += matrix[i + 1][j];

        }
        if (isInBounds(matrix,i - 1, j ) &&  matrix[i - 1][j] != valueToBeReplaced){
            sum += matrix[i - 1][j];

        }
        if (isInBounds(matrix, i, j +1 ) &&  matrix[i][j + 1] != valueToBeReplaced){
            sum += matrix[i][j + 1];

        }
        if (isInBounds(matrix,i, j - 1 ) &&  matrix[i][j - 1] != valueToBeReplaced){
            sum += matrix[i][j - 1];

        }


        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 &&  j < matrix[i].length;
    }


    private static int[] getArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
