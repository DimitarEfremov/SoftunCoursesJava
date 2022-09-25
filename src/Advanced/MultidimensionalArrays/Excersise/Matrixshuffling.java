package Advanced.MultidimensionalArrays.Excersise;

import java.util.Arrays;
import java.util.Scanner;

public class Matrixshuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = dimensions[0];
        int matrixColumns = dimensions[1];

        String[][] matrix = new String[matrixRows][matrixColumns];

        for (int i = 0; i < matrix.length ; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] command = input.split(" ");

            if (command[0].equals("swap") && command.length == 5){

                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);

                if (isInBounds(matrix,row1,col1) && isInBounds(matrix,row2,col2)){
                    String number1 = matrix[row1][col1];
                    String number2 = matrix[row2][col2];

                    matrix[row2][col2] = number1;
                    matrix[row1][col1] = number2;

                    print(matrix);


                } else {
                    System.out.println("Invalid input!");
                }

            }else {
                System.out.println("Invalid input!");
            }




            input = scanner.nextLine();
        }

    }

    private static boolean isInBounds(String[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 &&  j < matrix[i].length;
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
