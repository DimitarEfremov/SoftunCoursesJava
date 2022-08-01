package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitStr = new StringBuilder();
        StringBuilder letterStr = new StringBuilder();
        StringBuilder otherStr = new StringBuilder();


        for (int i = 0; i <text.length() ; i++) {
            char charAt = text.charAt(i);

            if (Character.isDigit(charAt)){
                digitStr.append(charAt);
            } else if (Character.isLetter(charAt)){
                letterStr.append(charAt);
            } else {
                otherStr.append(charAt);
            }

        }
        System.out.println(digitStr);
        System.out.println(letterStr);
        System.out.println(otherStr);
    }
}
