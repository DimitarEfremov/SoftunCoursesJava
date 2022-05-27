package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ramMemorie = Integer.parseInt(scanner.nextLine());

        double PriceVC = videoCard * 250;
        double pricePr = processor * (PriceVC * 0.35);
        double priceRM = ramMemorie * (PriceVC * 0.1);

        double totalPrice = PriceVC + pricePr + priceRM;

        if (videoCard > processor){
            totalPrice = totalPrice * 0.85;
        }

        if (budget > totalPrice){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
