package Basics.NestedLoops.Exercise;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumb = Integer.parseInt(scanner.nextLine());
        int secondNumb = Integer.parseInt(scanner.nextLine());
        int magicNumb = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean magic = false;

        for (int i = firstNumb; i <= secondNumb; i++) {

            for (int j = firstNumb; j <= secondNumb; j++) {

                counter++;

                if (i + j == magicNumb) {
                    magic = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumb);
                    break;
                }
            }
            if (magic) {
                break;
            }
        }
        if (!magic) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumb);
        }
    }
}
