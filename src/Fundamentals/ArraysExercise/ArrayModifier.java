package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("swap")) {
                int indexOne = Integer.parseInt(command[1]);
                int indexTwo = Integer.parseInt(command[2]);
                int oldChar = array[indexOne];
                array[indexOne] = array[indexTwo];
                array[indexTwo] = oldChar;
            }
            if (command[0].equals("multiply")) {
                int indexOne = Integer.parseInt(command[1]);
                int indexTwo = Integer.parseInt(command[2]);
                array[indexOne] = array[indexOne] * array[indexTwo];
            }
            if (command[0].equals("decrease")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] -= 1;
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
