package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);

        printSymbolsBetweenChar(firstInput,secondInput);
    }

    private static void printSymbolsBetweenChar (char firstChar, char secondChar){
        if (firstChar > secondChar){
            char temp = firstChar;
            firstChar = secondChar;
            secondChar = temp;
        }

        for (int i = firstChar +1; i < secondChar ; i++) {
            System.out.printf("%c ",i);
        }

    }
}
