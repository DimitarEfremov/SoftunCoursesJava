package Fundamentals.Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine();
            if (row % 2 != 0){
                firstArr[row - 1] = Integer.parseInt(input.split(" ")[0]) ;
                secondArr[row-1] = Integer.parseInt(input.split(" ")[1]) ;
            } else {
                firstArr[row-1] = Integer.parseInt(input.split(" ")[1]) ;
                secondArr[row-1] = Integer.parseInt(input.split(" ")[0]) ;
            }
            
        }
        for (int element: firstArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element: secondArr) {
            System.out.print(element + " ");
        }

    }
}
