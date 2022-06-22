package Fundamentals.MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double priceWithoutTaxes = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double partPrice = Double.parseDouble(input);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += partPrice;
            }

            input = scanner.nextLine();
        }

        double priceWithVAT = priceWithoutTaxes * 1.2;

        if (priceWithoutTaxes == 0){
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",priceWithVAT-priceWithoutTaxes);
            System.out.println("-----------");
            if (input.equals("special")){
                System.out.printf("Total price: %.2f$%n",priceWithVAT*0.9);
            } else if (input.equals("regular")){
                System.out.printf("Total price: %.2f$%n",priceWithVAT);
            }
        }
    }
}
