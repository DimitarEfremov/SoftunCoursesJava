package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder answer = new StringBuilder();
        answer.append(input.charAt(0));

        int positionfromAnswer = 0;

        for (int i = 0; i <input.length() ; i++) {


            if (answer.charAt(positionfromAnswer) != input.charAt(i)){
                answer.append(input.charAt(i));
                positionfromAnswer++;
            }


        }

        System.out.println(answer);

    }
}
