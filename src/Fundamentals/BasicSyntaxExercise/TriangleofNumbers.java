package Fundamentals.BasicSyntaxExercise;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int z = i;
            while (z != 0) {
                System.out.print(i + " ");
                z -= 1;
            }
            System.out.println();
        }

    }

}

