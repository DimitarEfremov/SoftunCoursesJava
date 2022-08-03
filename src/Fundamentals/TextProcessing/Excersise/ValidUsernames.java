package Fundamentals.TextProcessing.Excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");



        for (String name: input
             ) {
            if (isUserNameValid(name)){
            System.out.println(name);
            }
        }
    }

    private static boolean isUserNameValid (String userName){
            if (userName.length()<3 || userName.length()> 16){
                return false;
            }
        for (char symbol: userName.toCharArray()
             ) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-')
                return false;
        }
        return true;
    }
}
