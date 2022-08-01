package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");
        String answer = "";

        for (int i = 0; i < strings.length ; i++) {
            String word = strings[i];
            int wordLength = word.length();


            String combined = "";
            for (int j = 0; j <wordLength ; j++) {
                combined+= word;
            }
            answer+=combined;
        }

        System.out.println(answer);
    }
}
