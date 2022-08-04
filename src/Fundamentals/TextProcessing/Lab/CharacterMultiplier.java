package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        String stringOne = input[0];
        String stringTwo = input[1];

        int smallestLength = Math.min(stringOne.length(),stringTwo.length());

        int totalSum = 0;


        for (int i = 0; i <smallestLength; i++) {
            char firstChar = stringOne.charAt(i);
            char secondChar = stringTwo.charAt(i);
            totalSum+= firstChar * secondChar;
        }

        if (stringOne.length()>smallestLength){
            for (int i = 0; i <stringOne.length()-smallestLength ; i++) {
                totalSum+= stringOne.charAt(smallestLength+i);
            }
        }

        if (stringTwo.length() > smallestLength){
            for (int i = 0; i <stringTwo.length()-smallestLength ; i++) {
                totalSum+= stringTwo.charAt(smallestLength+i);
            }
        }

        System.out.println(totalSum);
    }
}
