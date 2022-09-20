package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionofTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = Integer.parseInt(scanner.nextLine());
        int charsInArray = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = createChatMatrix(scanner, arraySize, charsInArray);
        String[][] secondMatrix = createChatMatrix(scanner, arraySize, charsInArray);

        for (int r = 0; r <firstMatrix.length ; r++) {
            for (int c = 0; c <firstMatrix[r].length ; c++) {

                if (firstMatrix[r][c].equals(secondMatrix[r][c])){
                    System.out.print(firstMatrix[r][c] + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }

    }

    private static String[][] createChatMatrix(Scanner scanner, int arraySize, int charsInArray) {
        String[][] matrix = new String[arraySize][charsInArray];

        for (int r = 0; r <matrix.length ; r++) {
            matrix[r] = scanner.nextLine().split(" ");
        }
        return matrix;
    }

}
