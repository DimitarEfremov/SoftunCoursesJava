package Basics.WhileLoop.lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalBalance = 0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")){
            double amount = Double.parseDouble(input);

            if (amount < 0){
                System.out.println("Invalid operation!");
                break;
            }
            totalBalance += amount;

            System.out.printf("Increase: %.2f%n",amount);
            input = scanner.nextLine();
        }


        System.out.printf("Total: %.2f",totalBalance);

    }
}
