package Advanced.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        int[] coordinates = new int[2];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                if (matrix[r][c].equals("q")) {
                    if (checkForTrueQueen(matrix, r, c)) {
                        coordinates[0] = r;
                        coordinates[1] = c;
                    }
                }
            }
        }

        for (int coordinate : coordinates) {
            System.out.print(coordinate + " ");
        }

    }

    private static boolean checkForTrueQueen(String[][] matrix, int r, int c) {

        boolean noOther = true;




            for (int i = 0; i < 8; i++) {
                if (matrix[i][c].equals("q") && i != r) {
                    noOther = false;
                    break;
                }
            }
            for (int i = 0; i < 8; i++) {
                if (matrix[r][i].equals("q") && i != c) {
                    noOther = false;
                    break;
                }
            }

            for (int i = 1; i <= r; i++) {
                if (isInBounds(matrix, r - i, c - i)) {
                    if (matrix[r - i][c - i].equals("q")) {
                        noOther = false;
                        break;
                    }
                }
            }
            for (int i = 1; i <= r; i++) {
                if (isInBounds(matrix, r - i, c + i)) {
                    if (matrix[r - i][c + i].equals("q")) {
                        noOther = false;
                        break;
                    }
                }
            }

            for (int i = 1; i <= matrix.length - r; i++) {
                if (isInBounds(matrix, r + i, c - i)) {
                    if (matrix[r + i][c - i].equals("q")) {
                        noOther = false;
                        break;
                    }
                }
            }
            for (int i = 1; i <= matrix.length - r; i++) {
                if (isInBounds(matrix, r + i, c + i)) {
                    if (matrix[r + i][c + i].equals("q")) {
                        noOther = false;
                        break;
                    }
                }
            }



        return noOther;

    }

    private static boolean isInBounds(String[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 &&  j < matrix[i].length;
    }
}
