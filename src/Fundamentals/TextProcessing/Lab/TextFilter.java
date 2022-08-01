package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String word: bannedWordsArr
             ) {
            text = text.replaceAll(word,starsToReplace(word));
        }

        System.out.println(text);




    }
    private static String starsToReplace (String s){
        String result = "";
        for (int i = 0; i <s.length() ; i++) {
            result += '*';
        }
        return result;
    }
}
