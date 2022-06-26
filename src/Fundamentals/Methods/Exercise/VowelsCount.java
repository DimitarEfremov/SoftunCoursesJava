package Fundamentals.Methods.Exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        vowelCounterPrint(text);


    }

    private static void vowelCounterPrint (String text){
        int counter = 0;

        for (char symbol: text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'y' || symbol == 'u' || symbol == 'o' || symbol == 'i'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
