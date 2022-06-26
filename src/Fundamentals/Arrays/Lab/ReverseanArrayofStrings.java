package Fundamentals.Arrays.Lab;

import java.util.Scanner;

public class ReverseanArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = scanner.nextLine().split(" ");

        for (int i = 0; i < symbols.length /2; i++) {

            String oldChar = symbols[i];
            symbols[i] = symbols[symbols.length - 1 - i];
            symbols[symbols.length - 1 - i] = oldChar;

        }

        System.out.println(String.join(" ",symbols));




    }
}
