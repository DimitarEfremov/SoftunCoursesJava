package Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String nextLine = scanner.nextLine();

        int sum = 0;

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] % 2 == 0){
                sum += numberArr[i];
            }

        }

        System.out.println(sum);

    }
}
