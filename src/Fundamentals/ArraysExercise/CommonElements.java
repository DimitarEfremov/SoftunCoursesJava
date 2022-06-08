package Fundamentals.ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");

        String[] secondArray = scanner.nextLine().split(" ");

        for (String second : secondArray) {
            for (String first : firstArray) {
                if (second.equals(first)) {
                    System.out.print(second + " ");
                    break;

                }

            }


        }

    }

}


