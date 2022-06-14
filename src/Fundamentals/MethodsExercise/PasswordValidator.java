package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (!validLenght(text)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validSymbols(text)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!atLeastTwoDigits(text)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (validSymbols(text) && validSymbols(text) && atLeastTwoDigits(text)) {
            System.out.println("Password is valid");
        }

    }

    private static boolean validLenght(String text) {
        return text.length() >= 6 && text.length() <= 10;
    }

    private static boolean validSymbols(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean atLeastTwoDigits(String text) {
        int digits = 0;

        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digits++;
            }
        }
        return digits >= 2;

    }
}
