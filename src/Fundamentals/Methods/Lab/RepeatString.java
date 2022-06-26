package Fundamentals.Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String concatedText = repeatedString(text, n);
        System.out.println(concatedText);
    }

    public static String repeatedString(String repeatedString, int n){
        String resultedText = "";
        for (int i = 0; i <n ; i++) {
            resultedText +=repeatedString;

        }
        return resultedText;
    }
}
