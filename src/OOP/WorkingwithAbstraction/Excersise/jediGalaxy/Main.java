package OOP.WorkingwithAbstraction.Excersise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        int[][] galaxyMatrix = new int[rows][cols];

        fillTheGalaxyMatrix(rows, cols, galaxyMatrix);

        String command = scanner.nextLine();
        long collectedStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jedyPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowOfEvil = evilPosition[0];
            int colOfEvil = evilPosition[1];

            while (rowOfEvil >= 0 && colOfEvil >= 0) {
                if (rowOfEvil >= 0 && rowOfEvil < galaxyMatrix.length && colOfEvil >= 0 && colOfEvil < galaxyMatrix[0].length) {
                    galaxyMatrix[rowOfEvil][colOfEvil] = 0;
                }
                rowOfEvil--;
                colOfEvil--;
            }

            int xI = jedyPosition[0];
            int yI = jedyPosition[1];

            while (xI >= 0 && yI < galaxyMatrix[1].length) {
                if (xI >= 0 && xI < galaxyMatrix.length && yI >= 0 && yI < galaxyMatrix[0].length) {
                    collectedStars += galaxyMatrix[xI][yI];
                }

                yI++;
                xI--;
            }

            command = scanner.nextLine();
        }

        System.out.println(collectedStars);


    }

    private static void fillTheGalaxyMatrix(int rows, int cols, int[][] galaxyMatrix) {
        int value = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                galaxyMatrix[r][c] = value++;
            }
        }
    }
}
