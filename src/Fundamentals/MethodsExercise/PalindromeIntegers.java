package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
          System.out.println(isPalindrome(input));

            input= scanner.nextLine();
        }

    }

    private static boolean isPalindrome (String number){
        String[] symbols = number.split("");

        for (int i = 0; i <number.length()/2 ; i++) {
            String oldChar = symbols[i];
            symbols[i] = symbols[symbols.length - 1 - i];
            symbols[symbols.length - 1 - i] = oldChar;
        }
        String reversed = String.join("",symbols);

        return reversed.equals(number);
    }
}
