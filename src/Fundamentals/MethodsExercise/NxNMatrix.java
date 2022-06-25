package Fundamentals.MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printNxnMatrix(input);
    }

    private static void printNxnMatrix  (int number){

        for (int i = 0; i <number ; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(number + " ");
                if (j==number-1){
                    System.out.println();
                }
            }
        }
    }
}
