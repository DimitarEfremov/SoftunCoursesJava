package Fundamentals.Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            switch (command[0]){
                case "exchange":
                    inputArray = exchangeArrayAfterIndex(command[1], inputArray );
                    break;
            }


            input = scanner.nextLine();
        }
    }

    private static int[] exchangeArrayAfterIndex(String arrayIndex, int[] inputArray){
        int index = Integer.parseInt(arrayIndex);

        int[] newFirstHalf = new int[inputArray.length - 1 -index];
        int[] newSecondHalf =  new int[inputArray.length - newFirstHalf.length];

        for (int i = 0; i < newFirstHalf.length; i++) {
            newFirstHalf[i] = inputArray[index +1 + i];
        }
        for (int i = 0; i <newSecondHalf.length ; i++) {
            newSecondHalf[i] = inputArray[i];
        }
        for (int i = 0; i < newFirstHalf.length ; i++) {
            inputArray[i] = newFirstHalf[i];
        }
        for (int i = 0; i < newSecondHalf.length ; i++) {
            inputArray[newFirstHalf.length + i] = newSecondHalf[i];
        }

        return inputArray;
    }
}
