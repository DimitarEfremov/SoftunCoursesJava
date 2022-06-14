package Fundamentals.MethodsLab;

import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int result = multiplyEvensbyOdds(input);

        System.out.println(result);
    }

    public static int multiplyEvensbyOdds(int number) {
        number = Math.abs(number);
        int oddSum = sumOds(number);
        int evenSum = sumEvens(number);

        return oddSum * evenSum;
    }

    public static int sumOds(int number) {
        int oddSum = 0;

        while (number > 0) {
            int temp = 0;
            temp = number % 10;
            if (temp % 2 != 0) {
                oddSum += temp;
            }
            number /= 10;
        }

        return oddSum;
    }

    public static int sumEvens(int number) {
        int evenSum = 0;

        while (number > 0) {
            int temp = 0;
            temp = number % 10;
            if (temp % 2 == 0) {
                evenSum += temp;
            }
            number /= 10;
        }

        return evenSum;
    }

}
