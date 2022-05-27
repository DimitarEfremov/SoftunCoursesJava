package Basics.ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int even = 0;
        int odd = 0;

        for (int i = 1; i<=n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                even += input;
            } else {
                odd += input;
            }
        }

        int difference = Math.abs(even-odd);

        if (difference == 0){
            System.out.printf("Yes%nSum = %d", odd);
        } else {
            System.out.printf("No%nDiff = %d", difference);
        }
    }
}
