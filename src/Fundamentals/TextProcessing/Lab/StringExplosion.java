package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int explosion = 0;

        for (int i = 0; i <input.length(); i++) {

            if (input.charAt(i) == '>'){
                explosion+= Integer.parseInt(String.valueOf(input.charAt(i+1)));
            } if (input.charAt(i) != '>' && explosion >0){
                input.deleteCharAt(i);
                explosion--;
                i--;
            }

        }

        System.out.println(input);
    }
}
