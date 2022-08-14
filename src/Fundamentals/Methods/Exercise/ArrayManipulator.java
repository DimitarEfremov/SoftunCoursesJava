package Fundamentals.Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "exchange":
                    if (Integer.parseInt(command[1]) > inputArray.length -1){
                        System.out.println("Invalid index");
                    } else {
                        inputArray = exchangeArrayAfterIndex(command[1], inputArray);
                    }
                    break;
                case "max":
                    int n = findMaxDigit(command[1], inputArray);
                    int result = 0;
                    if (n == Integer.MIN_VALUE) {
                        System.out.println("No matches");
                    } else {
                        for (int i = 0; i < inputArray.length; i++) {
                            if (inputArray[i] == n) {
                                result = i;
                            }
                        }
                        System.out.printf("%d%n", result);
                    }
                    break;

                case "min":
                    int n2 = findMinDigit(command[1], inputArray);
                    int result1 = 0;
                    if (n2 == Integer.MAX_VALUE) {
                        System.out.println("No matches");
                    } else {
                        for (int i = 0; i < inputArray.length; i++) {
                            if (inputArray[i] == n2) {
                                result = i;
                            }
                        }

                        System.out.printf("%d%n", result1);
                    }
                    break;

                case "first":


                    break;
            }




            input = scanner.nextLine();
        }
    }

    private static int[] exchangeArrayAfterIndex(String arrayIndex, int[] inputArray) {

        int index = Integer.parseInt(arrayIndex);

        int[] newFirstHalf = new int[inputArray.length - 1 - index];
        int[] newSecondHalf = new int[inputArray.length - newFirstHalf.length];

        for (int i = 0; i < newFirstHalf.length; i++) {
            newFirstHalf[i] = inputArray[index + 1 + i];
        }
        for (int i = 0; i < newSecondHalf.length; i++) {
            newSecondHalf[i] = inputArray[i];
        }
        for (int i = 0; i < newFirstHalf.length; i++) {
            inputArray[i] = newFirstHalf[i];
        }
        for (int i = 0; i < newSecondHalf.length; i++) {
            inputArray[newFirstHalf.length + i] = newSecondHalf[i];
        }

        return inputArray;
    }

    private static int findMaxDigit(String oddOrEven, int[] inputArray) {
        int max = Integer.MIN_VALUE;
        if (oddOrEven.equals("even")) {
            for (int n : inputArray) {
                if (n % 2 == 0) {
                    if (n > max) {
                        max = n;
                    }
                }
            }
        } else if (oddOrEven.equals("odd")) {
            for (int n : inputArray) {
                if (n % 2 != 0) {
                    if (n > max) {
                        max = n;
                    }
                }
            }
        }
        return max;
    }

    private static int findMinDigit(String oddOrEven, int[] inputArray) {
        int min = Integer.MAX_VALUE;
        if (oddOrEven.equals("even")) {
            for (int n : inputArray) {
                if (n / 2 == 0) {
                    if (n < min) {
                        min = n;
                    }
                }
            }
        } else if (oddOrEven.equals("odd")) {
            for (int n : inputArray) {
                if (n % 2 != 0) {
                    if (n < min) {
                        min = n;
                    }
                }
            }
        }
        return min;
    }


}
