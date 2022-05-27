package Basics.ForLoop.Lab;

import java.util.Scanner;

public class Numbersequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input >= maxNumber) {
                maxNumber = input;
            }
            if (input <= minNumber) {
                minNumber = input;
            }
        }

        System.out.printf("Max number: %d%nMin number: %d", maxNumber, minNumber);
    }
}
