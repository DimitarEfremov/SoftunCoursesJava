package OOP.ExceptionsandErrorHandling.Lab;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            System.out.printf("%.2f%n",sqrt(input));
        } catch (IllegalArgumentException ignored){
            System.out.println("Invalid");
        }

        System.out.println("Goodbye");




    }

    private static double sqrt(String input) {

        int number = Integer.parseInt(input);

        if (number < 0){
            throw new IllegalArgumentException("number" + number + "is negative");
        }


        return Math.sqrt(number);
    }
}
