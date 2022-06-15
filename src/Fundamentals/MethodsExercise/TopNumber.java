package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=inputNum ; i++) {
            printTopNumber(i);
        }
    }

    private static void printTopNumber (int number) {
        if (isDivisibleBy8(number) && oneOddDigit(number)){
            System.out.println(number);
        }
    }

    private static boolean isDivisibleBy8 (int number){
                int sum = 0;
                while (number >0){
                    sum += number % 10;
                    number /=10;
                }

            return (sum % 8 == 0);
    }
    private static boolean oneOddDigit ( int number){
        while (number>0){
            int temp = number % 10;
            if (temp % 2 != 0){
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
