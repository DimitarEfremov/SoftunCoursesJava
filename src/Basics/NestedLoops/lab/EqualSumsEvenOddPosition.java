package Basics.NestedLoops.lab;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        while (first <= second) {
            int number = first;
            for (int i = 6; i >= 1; i--) {


                int digit = number % 10;
                number = number / 10;

                if (i % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }


            }
            if (oddSum == evenSum) {
                System.out.print(first + " ");
            }


            evenSum = 0;
            oddSum = 0;

            first++;
        }


    }
}
