package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i <array.length ; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] > max){
                    max = array[j];
                }
                }
            if (array[i] > max){
                System.out.print(array[i] + " ");
            }
        }
    }
}
