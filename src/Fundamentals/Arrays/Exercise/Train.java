package Fundamentals.Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] cargo = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            cargo[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int number : cargo) {
            sum += number;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(cargo[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
