package Fundamentals.MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actionInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (actionInput) {
            case "add":
                printAddition(firstNumInput, secondNumInput);
                break;
            case "multiply":
               printMultiplication(firstNumInput, secondNumInput);
                break;
            case "subtract":
                printSubtraction(firstNumInput, secondNumInput);
                break;
            case "divide":
                printDivision(firstNumInput, secondNumInput);
                break;
        }
    }

    public static void printAddition(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void printSubtraction(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void printDivision(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void printMultiplication(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }
}
