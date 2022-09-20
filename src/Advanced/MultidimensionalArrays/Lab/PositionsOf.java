package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = getMatrix(scanner);

        int lookingFor = scanner.nextInt();

        boolean isNotFound = true;

        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix[r].length ; c++) {

                if (lookingFor == matrix[r][c]){
                    System.out.printf("%d %d%n", r, c);
                    isNotFound = false;
                }
            }
        }
        if (isNotFound){
            System.out.println("not found");
        }


    }

    private static int[][] getMatrix(Scanner scanner) {
        int [] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] matrix = new int[dimensions[0]][dimensions[1]];

        for (int i = 0; i < matrix.length ; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

}
