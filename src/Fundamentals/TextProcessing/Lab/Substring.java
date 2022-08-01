package Fundamentals.TextProcessing.Lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toBeRemoved = scanner.nextLine();
        String toWorkWith = scanner.nextLine();

        while (toWorkWith.contains(toBeRemoved)){

            toWorkWith = toWorkWith.replace(toBeRemoved,"");


        }

        System.out.println(toWorkWith);
    }
}
