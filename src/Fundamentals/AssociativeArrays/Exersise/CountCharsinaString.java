package Fundamentals.AssociativeArrays.Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();


        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (int i = 0; i < words.length(); i++) {
            char currentChar = words.charAt(i);

            if (charMap.containsKey(currentChar)) {
                int currentValue = charMap.get(currentChar);
                charMap.put(currentChar, currentValue + 1);
            } else {
                charMap.put(currentChar, 1);
            }

        }

        charMap.remove(' ');


        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}