package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalSpace = wight * length * height;

        while (totalSpace >0){
            String input = scanner.nextLine();
            if (input.equals("Done")){
                break;
            }
            int boxSize = Integer.parseInt(input);
            totalSpace -= boxSize;
        }


        if (totalSpace <0){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(totalSpace));
        } else {
            System.out.printf("%d Cubic meters left.",totalSpace);
        }
    }
}
