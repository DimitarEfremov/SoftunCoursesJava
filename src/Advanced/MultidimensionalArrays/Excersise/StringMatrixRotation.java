package Advanced.MultidimensionalArrays.Excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationInput = scanner.nextLine();

        int rotation = Integer.parseInt(rotationInput.split("[()]")[1]);

        int angle = rotation%360;


        List<String> wordsList = new ArrayList<>();

        String input = scanner.nextLine();

        int matrixCols = Integer.MIN_VALUE;

        while (!input.equals("END")){

            if (input.length() > matrixCols){
                matrixCols = input.length();
            }

        wordsList.add(input);

            input = scanner.nextLine();
        }

        int matrixRows = wordsList.size();


        char[][] matrix = new char[matrixRows][matrixCols];


        for (int r = 0; r < matrixRows; r++) {
            String currentWord = wordsList.get(r);

            for (int c = 0; c <matrixCols ; c++) {
                if (c < currentWord.length()){
                    matrix[r][c] = currentWord.charAt(c);
                } else {
                    matrix[r][c] = ' ';
                }

            }
        }

        switch (angle){

            case 0:
                print(matrix);
                break;
            case 90:
                for (int r = 0 ; r < matrixCols ; r++) {
                    for (int c = matrixRows -1 ; c >= 0 ; c--) {
                        System.out.print(matrix[c][r]);

                    }
                    System.out.println();
                }

                break;
            case 180:
                for (int r = matrixRows - 1 ; r >=0 ; r--) {
                    for (int c = matrixCols  -1 ; c >= 0 ; c--) {
                        System.out.print(matrix[r][c]);

                    }
                    System.out.println();
                }

                break;
            case 270:

                for (int r = matrixCols - 1 ; r >=0 ; r--) {
                    for (int c = 0 ; c < matrixRows ; c++) {
                        System.out.print(matrix[c][r]);

                    }
                    System.out.println();
                }

                break;


        }



    }

    private static void print(char[][] matrix) {
        for (char[] ints : matrix) {
            for (char anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

}

