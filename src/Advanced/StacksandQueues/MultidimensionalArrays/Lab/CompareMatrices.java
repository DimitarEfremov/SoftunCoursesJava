package Advanced.StacksandQueues.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] firstMatrix = new int[firstDimensions[0]][firstDimensions[1]];

        firstMatrix[0] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        firstMatrix[1] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] secondDimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int [] [] secondMatrix = new int[firstDimensions[0]][firstDimensions[1]];

        secondMatrix[0] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        secondMatrix[1] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean equal = true;

        if ()


    }
}
