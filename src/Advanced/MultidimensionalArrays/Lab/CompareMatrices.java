package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = getFirstMatrix(scanner);

        int[][] secondMatrix = getFirstMatrix(scanner);


        boolean equal = areArraysEqual(firstMatrix,secondMatrix);



        if (equal){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }

    private static int[][] getFirstMatrix(Scanner scanner) {
        int [] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i <dimensions[0] ; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

    private static boolean areArraysEqual(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length){
            return false; }

        for (int r = 0; r < firstMatrix.length ; r++) {


            if (firstMatrix[r].length != secondMatrix[r].length){
                return false;
            }

            for (int c = 0; c <firstMatrix[r].length ; c++) {
                int firstNumber = firstMatrix[r][c];
                int secondNumber = secondMatrix[r][c];

                if (firstNumber !=secondNumber){
                    return false;
                }
            }
        }

        return true;
    }

}


