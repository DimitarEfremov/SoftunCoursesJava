package Basics.WhileLoop.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int goal = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int counter = 0;

        int counterCash = 0;
        int counterCredit = 0;

        double moneyCash = 0;
        double moneyCredit = 0;

        boolean success = false;


        while (!input.equals("End")){
            double sum = Integer.parseInt(input);
            counter++;

            if (counter % 2 != 0){
                if (sum > 100){
                    System.out.println("Error in transaction!");
                } else {
                    moneyCash += sum;
                    counterCash++;
                    System.out.println("Product sold!");
                }

            } else {
                if (sum< 10){
                    System.out.println("Error in transaction!");
                } else {
                    moneyCredit += sum;
                    counterCredit ++;
                    System.out.println("Product sold!");
                }

            }


            if (moneyCredit+moneyCash >= goal){
                success = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (success){
            System.out.printf("Average CS: %.2f%n",moneyCash/counterCash);
            System.out.printf("Average CC: %.2f",moneyCredit/counterCredit);
        } else {
            System.out.print("Failed to collect required money for charity.");
        }




    }
}
