package Fundamentals.Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        while (numberArr.length > 1 ) {

            int[] condensed = new int[numberArr.length - 1];
            for (int i = 0; i < numberArr.length - 1; i++) {

                condensed[i] = numberArr[i] + numberArr[i + 1];
            }
            numberArr = condensed;
        }

        System.out.println(numberArr[0]);
    }
}
