package Fundamentals.TextProcessing.Excersise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
                char toWork = input.charAt(i);
                char encryptedSymbol = (char) (toWork +3);
                encryptedText.append(encryptedSymbol);

        }

        System.out.println(encryptedText);
    }
}
