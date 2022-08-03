package Fundamentals.TextProcessing.Excersise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int strength = 0;

        for (int i = 0; i < input.length() ; i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '>'){

                strength += Integer.parseInt(String.valueOf(input.charAt(i+1)));
            }
        }


    }
}
