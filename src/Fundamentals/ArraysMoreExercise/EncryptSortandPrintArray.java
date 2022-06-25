package Fundamentals.ArraysMoreExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] namesToBeCoded = new String[n];
        Integer[] encodedNames = new Integer[n];

        for (int i = 0; i <n ; i++) {
            namesToBeCoded[i] = scanner.nextLine();
        }

        for (int i = 0; i < namesToBeCoded.length; i++) {
            String element = namesToBeCoded[i];
            element = element.trim();

            int sum = 0;

            for (int j = 0; j < element.length(); j++) {

                char toUSe = element.charAt(j);
                if (isVowel(toUSe)){
                    sum += toUSe * element.length();
                } else {
                    sum += toUSe /element.length();
                }
            }
            encodedNames[i] = sum;
        }

        Arrays.sort(encodedNames);
        for (Integer element: encodedNames) {
            System.out.println(element);

        }
    }

    private static boolean isVowel (char symbol){

        return symbol == 'a' || symbol == 'e' || symbol == 'u' || symbol == 'o' || symbol == 'i' ||
                symbol == 'A' || symbol == 'E' || symbol == 'U' || symbol == 'O' || symbol == 'I';
    }
}
