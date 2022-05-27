package Basics.ForLoop.Lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;

        for (int i = 1; i<=n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            left += input;
        }

        for (int i = 1; i<=n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            right += input;
        }

        int difference = Math.abs(left-right);

        if (difference == 0){
            System.out.printf("Yes, sum = %d", left);
        } else {
            System.out.printf("No, diff = %d", difference);
        }
    }
}
