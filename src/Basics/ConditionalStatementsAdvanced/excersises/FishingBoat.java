package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.next());
        String season = scanner.next();
        int group = Integer.parseInt(scanner.next());

        int shipRent = 0;

        switch (season) {
            case "Spring":
                shipRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipRent = 4200;
                break;
            case "Winter":
                shipRent = 2600;
                break;
        }

        double finalPrice = 0;
        if (group <= 6) {
            finalPrice = shipRent * 0.9;
        } else if (group <= 11) {
            finalPrice = shipRent * 0.85;
        } else {
            finalPrice = shipRent * 0.75;
        }

        if (group % 2 == 0)
            if (!season.equals("Autumn")) {
                finalPrice = finalPrice * 0.95;
            }

        if (budget>=finalPrice){
            System.out.printf("Yes! You have %.2f leva left.", budget-finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", finalPrice - budget);
        }



    }
}
