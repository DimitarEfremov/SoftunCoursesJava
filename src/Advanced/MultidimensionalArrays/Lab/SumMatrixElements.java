package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] [] matrix = getMatrix(scanner);


        System.out.println( matrix.length );
        System.out.println(matrix[0].length);

        int sum = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum+=anInt;
            }
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
