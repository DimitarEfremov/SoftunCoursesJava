package Advanced.MultidimensionalArrays.Excersise;

import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");

        int size = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[size][size];

                matrix = methodA(size, type);


                print(matrix);

        }

    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] methodA(int size, String type) {

        int[][] matrix = new int[size][size];

        switch (type){
            case "A":
                int numbA = 1;
                for (int col = 0; col < size; col++) {
                    for (int row = 0; row < size; row++) {
                        matrix[row][col] = numbA++;
                    }
                }
                break;
            case "B":
                int numbB = 1;
                for (int col = 0; col < size; col++) {
                    if (col % 2 == 0){
                        for (int row = 0; row < size; row++) {
                            matrix[row][col] = numbB++;
                        }
                    } else {
                        for (int row = matrix.length -1 ; row >= 0; row--) {
                            matrix[row][col] = numbB++;
                        }
                    }
                }
                break;

    }

    return matrix;
}




}
