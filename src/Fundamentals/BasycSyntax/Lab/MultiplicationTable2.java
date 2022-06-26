package Fundamentals.BasycSyntax.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n2 > 10){
            System.out.printf("%d X %d = %d%n", n1, n2, n2*n1);
        }

        for (int i = n2; i <= 10; i++) {

            int result = n1 * i;

            System.out.printf("%d X %d = %d%n", n1, i, result);

        }
    }
}
