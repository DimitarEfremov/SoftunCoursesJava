package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long factoral1 = calculateFactoral(number1);
        long factoral2 = calculateFactoral(number2);

        double finalResult = 1.0*factoral1/factoral2;
        System.out.printf("%.2f",finalResult);

    }

    private static long calculateFactoral (int number){
        long result = 1;
        for (int i = 1; i <=number ; i++) {
            result *=i;
        }
        return result;
    }
}
