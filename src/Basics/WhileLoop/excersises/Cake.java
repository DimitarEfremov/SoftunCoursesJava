package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

        int cakeSize = sideA * sideB;

        while (cakeSize > 0){
            String input = scanner.nextLine();
            if (input.equals("STOP")){
                break;
            }
            int cutPieces = Integer.parseInt(input);
            cakeSize-= cutPieces;
        }

        if (cakeSize < 0) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakeSize));
        } else {
            System.out.printf("%d pieces are left.", cakeSize);
        }
    }
}
