package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String reversed = "";
            for (int i = input.length()-1; i >=0 ; i--) {
                char charAt = input.charAt(i);
                reversed += charAt;


            }

            System.out.println(input + " = " + reversed);
            input = scanner.nextLine();
        }

    }
}
