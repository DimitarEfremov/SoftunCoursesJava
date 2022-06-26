package Fundamentals.BasycSyntax.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.next();

        double cash = 0;

        while (!input1.equals("Start")){
            double coin = Double.parseDouble(input1);

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2 ){
                cash += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }

            input1 = scanner.next();
        }

        String input2 = scanner.next();

        while (!input2.equals("End")){

            switch (input2){
                case "Nuts":
                    if (cash>=2){
                        System.out.println("Purchased Nuts");
                        cash-=2;
                    } else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Water":
                    if (cash>=0.7){
                        System.out.println("Purchased Water");
                        cash-=0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Crisps":
                    if (cash>=1.5){
                        System.out.println("Purchased Crisps");
                        cash-=1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Soda":
                    if (cash>=0.8){
                        System.out.println("Purchased Soda");
                        cash-=0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                case "Coke":
                    if (cash>=1){
                        System.out.println("Purchased Coke");
                        cash-=1;
                    } else {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid product");

            }
            input2 = scanner.next();
        }
        System.out.printf("Change: %.2f",cash);
    }
}
