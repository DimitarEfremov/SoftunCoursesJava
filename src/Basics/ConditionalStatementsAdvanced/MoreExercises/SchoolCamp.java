package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int groupAmount = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (group) {
            case "boys":
                if (season.equals("Winter")) {
                    price = 9.6;
                    sport = "Judo";

                } else if (season.equals("Spring")) {
                    price = 7.2;
                    sport = "Tennis";
                } else if (season.equals("Summer")) {
                price = 15;
                sport = "Football";
            }

            break;
            case "girls":
                if (season.equals("Winter")) {
                    price = 9.6;
                    sport = "Gymnastics";
                } else if (season.equals("Spring")) {
                    price = 7.2;
                    sport = "Athletics";
                } else if (season.equals("Summer")) {
                price = 15;
                sport = "Volleyball";
            }
            break;
            case "mixed":
                if (season.equals("Winter")) {
                    price = 10;
                    sport = "Ski";
                } else if (season.equals("Spring")) {
                    price = 9.5;
                    sport = "Cycling";
                } else if (season.equals("Summer")) {
                price = 20;
                sport = "Swimming";
            }
            break;
        }

        if ( groupAmount >= 10 && groupAmount < 20) {
            price *= 0.95;
        } else if (groupAmount >= 20 && groupAmount < 50) {
            price *= 0.85;
        } else if (groupAmount >= 50) {
            price *= 0.5;
        }

        System.out.printf("%s %.2f lv.", sport, (price * nights * groupAmount));

    }
}
