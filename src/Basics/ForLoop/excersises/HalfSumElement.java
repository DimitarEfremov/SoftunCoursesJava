package Basics.ForLoop.excersises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <=n; i++){
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if (input>max){
                max=input;
            }
        }

        if ((sum - max) == max ){
            System.out.printf("Yes%nSum = %d", max);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(max - (sum - max)));
        }
    }
}