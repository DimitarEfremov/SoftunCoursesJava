package com.company.BasicSyntaxEcercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int factSum = 0;
        int startNum = number;

        while (number != 0) {
            int currentNum = number % 10;

            int fact = 1;

            for (int i = 1; i <= currentNum; i++) {
                fact *= i;

            }
            factSum += fact;
            number = number / 10;
        }

        if (factSum == startNum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
