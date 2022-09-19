package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] firstMatrix = new int[firstDimensions[0]][firstDimensions[1]];

        for (int i = 0; i <firstDimensions[0] ; i++) {

            firstMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int [] secondDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] secondMatrix = new int[secondDimensions[0]][secondDimensions[1]];

        for (int i = 0; i <secondDimensions[0] ; i++) {

            secondMatrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        boolean equal = firstMatrix.length == secondMatrix.length &&  areArraysEqual(firstMatrix,secondMatrix);



        if (equal){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }

    private static boolean areArraysEqual(int[][] firstMatrix, int[][] secondMatrix) {

        for (int r = 0; r < firstMatrix.length ; r++) {

            int[] firstArr = firstMatrix[0];
            int[] secondArr = secondMatrix[0];

            if (firstArr.length != secondArr.length){
                return false;
            }

            for (int c = 0; c <firstArr.length ; c++) {
                    int firstNumber = firstArr[c];
                    int secondNumber = secondArr[c];

                    if (firstNumber !=secondNumber){
                        return false;
                    }
            }
        }
            return true;
    }

}
