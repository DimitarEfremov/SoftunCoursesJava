package Advanced.ExamPrep.First;

import java.util.Scanner;

public class ReVolt {

    private static int charRow;
    private static int charCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int commandsAmount = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[size][];

        boolean playerWon = false;


        for (int i = 0; i < size; i++) {
            String data = scanner.nextLine();
            matrix[i] = data.toCharArray();

            if (data.contains("f")) {
                charRow = i;
                charCol = data.indexOf('f');
            }
        }

        for (int i = 0; i < commandsAmount; i++) {
            String command = scanner.nextLine();

            switch (command) {

                case "up":
                    int rowToMoveUp = charRow - 1;
                    if (rowToMoveUp == -1) {
                        rowToMoveUp = matrix.length - 1;
                    }

                    if (matrix[rowToMoveUp][charCol] == 'T') {
                        break;
                    }

                    if (matrix[rowToMoveUp][charCol] == 'B') {
                        rowToMoveUp--;
                        if (rowToMoveUp == -1) {
                            rowToMoveUp = matrix.length - 1;
                        }
                    }

                    if (matrix[rowToMoveUp][charCol] == '-') {
                        matrix[rowToMoveUp][charCol] = 'f';
                        matrix[charRow][charCol] = '-';
                        charRow = rowToMoveUp;
                    }

                    if (matrix[rowToMoveUp][charCol] == 'F') {
                        matrix[rowToMoveUp][charCol] = 'f';
                        matrix[charRow][charCol] = '-';
                        playerWon = true;
                        break;
                    }

                    break;
                case "down":

                    int rowToMoveDown = charRow + 1;
                    if (rowToMoveDown == matrix.length) {
                        rowToMoveDown = 0;
                    }

                    if (matrix[rowToMoveDown][charCol] == 'T') {
                        break;
                    }

                    if (matrix[rowToMoveDown][charCol] == 'B') {
                        rowToMoveDown++;
                        if (rowToMoveDown == matrix.length) {
                            rowToMoveDown = 0;
                        }
                    }

                    if (matrix[rowToMoveDown][charCol] == '-') {
                        matrix[rowToMoveDown][charCol] = 'f';
                        matrix[charRow][charCol] = '-';
                        charRow = rowToMoveDown;
                    }

                    if (matrix[rowToMoveDown][charCol] == 'F') {
                        matrix[rowToMoveDown][charCol] = 'f';
                        matrix[charRow][charCol] = '-';
                        playerWon = true;
                        break;
                    }

                    break;
                case "left":

                    int colToMoveLeft = charCol - 1;
                    if (colToMoveLeft == -1) {
                        colToMoveLeft = matrix[charRow].length - 1;
                    }

                    if (matrix[charRow][colToMoveLeft] == 'T') {
                        break;
                    }

                    if (matrix[charRow][colToMoveLeft] == 'B') {
                        colToMoveLeft--;
                        if (colToMoveLeft == -1) {
                            colToMoveLeft = matrix[charRow].length - 1;
                        }
                    }

                    if (matrix[charRow][colToMoveLeft] == '-') {
                        matrix[charRow][colToMoveLeft] = 'f';
                        matrix[charRow][charCol] = '-';
                        charCol = colToMoveLeft;
                    }

                    if (matrix[charRow][colToMoveLeft] == 'F') {
                        matrix[charRow][colToMoveLeft] = 'f';
                        matrix[charRow][charCol] = '-';
                        playerWon = true;
                        break;
                    }
                    break;


                case "right":

                    int colToMoveRight = charCol + 1;
                    if (colToMoveRight == matrix[charRow].length) {
                        colToMoveRight = 0;
                    }

                    if (matrix[charRow][colToMoveRight] == 'T') {
                        break;
                    }

                    if (matrix[charRow][colToMoveRight] == 'B') {
                        colToMoveRight++;
                        if (colToMoveRight == matrix[charRow].length) {
                            colToMoveRight = 0;
                        }
                    }

                    if (matrix[charRow][colToMoveRight] == '-') {
                        matrix[charRow][colToMoveRight] = 'f';
                        matrix[charRow][charCol] = '-';
                        charCol = colToMoveRight;
                    }

                    if (matrix[charRow][colToMoveRight] == 'F') {
                        matrix[charRow][colToMoveRight] = 'f';
                        matrix[charRow][charCol] = '-';
                        playerWon = true;
                        break;
                    }

                    break;

            }

            if (playerWon) {
                break;
            }
        }


        if (playerWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }


        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
