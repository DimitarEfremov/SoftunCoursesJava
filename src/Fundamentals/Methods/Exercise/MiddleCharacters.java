package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        middleCharactersPrint(inputText);
    }

    private static void middleCharactersPrint (String text){
        if (text.length() % 2 != 0){
            System.out.println(text.charAt(text.length()/2));
        } else {
            System.out.println( "" + text.charAt((text.length()/2)-1) + text.charAt(text.length()/2));
        }


    }
}
