package OOP.WorkingwithAbstraction.Lab;

import java.util.Scanner;

public class RhombusofStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        printTopPart(n);

        printBottomPart(n);

    }

    private static void printBottomPart(int n) {
        for (int i = n - 2; i >= 0 ; i--) {
            printRow(n, i);
        }
    }

    private static void printTopPart(int n) {
        for (int row = 0; row < n ; row++) {
            printRow(n, row);
        }
    }

    private static void printRow(int n, int row) {
        for (int space = 1; space <n - row ; space++) {
            System.out.print(" ");
        }
        for (int stars = 0; stars <= row ; stars++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
