package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double cost = 0;
        String type = "";
        String destination = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    cost = 0.3 * budget;
                    type = "Camp";
                    break;
                case "winter":
                    cost = 0.7 * budget;
                    type = "Hotel";
                    break;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    cost = 0.4 * budget;
                    type = "Camp";
                    break;
                case "winter":
                    cost = 0.8 * budget;
                    type = "Hotel";
                    break;
            }
        } else {
            destination = "Europe";
            type = "Hotel";
            cost = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f",destination,type,cost);


    }
}
