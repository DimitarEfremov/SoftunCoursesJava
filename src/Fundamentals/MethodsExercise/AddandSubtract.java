package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sumFirstTwoNums = sumMethod(firstNum, secondNum);
        int finalNum = subtractMethod(sumFirstTwoNums,thirdNum);

        System.out.println(finalNum);

    }

    private static int sumMethod (int n1, int n2) {
        return n1 + n2;
    }
    private static int subtractMethod (int n1, int n2) {
        return n1 - n2;
    }
}
