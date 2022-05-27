package Basics.WhileLoop.lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        String input = scanner.nextLine();

        while (!pass.equals(input)){
            input = scanner.nextLine();
        }

        System.out.println("Welcome "+ name +"!");
    }
}
