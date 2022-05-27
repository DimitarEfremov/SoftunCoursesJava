package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;

        switch (ticketType) {
            case "Normal":
                ticketPrice = 249.99;
                break;
            case "VIP":
                ticketPrice = 499.99;
                break;

        }

        if (group < 5) {
            budget = budget * 0.25;
        } else if (group >= 5 && group < 10) {
            budget = budget * 0.4;
        } else if (group >= 10 && group < 25) {
            budget = budget * 0.5;
        } else if (group >= 25 && group < 50) {
            budget = budget * 0.6;
        } else if (group >= 50) {
            budget = budget * 0.75;
        }

        if (budget > group * ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - group * ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - group * ticketPrice));
        }
    }
}
