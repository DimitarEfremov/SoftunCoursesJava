package Fundamentals.DataTypesExcersise;

import java.util.Scanner;

public class PrintPartOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int i = startCode; i <=endCode ; i++) {

            System.out.printf("%c ",i);

        }
    }
}
