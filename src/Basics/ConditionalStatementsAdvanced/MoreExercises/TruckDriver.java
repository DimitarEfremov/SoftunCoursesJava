package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double pay = 0;

        if (kmPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pay = kmPerMonth * 0.75;
                    break;
                case "Summer":
                    pay = kmPerMonth * 0.9;
                    break;
                case "Winter":
                    pay = kmPerMonth * 1.05;
                    break;
            }

        } else if (kmPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pay = kmPerMonth * 0.95;
                    break;
                case "Summer":
                    pay = kmPerMonth * 1.1;
                    break;
                case "Winter":
                    pay = kmPerMonth * 1.25;
                    break;
            }

        } else if (kmPerMonth <= 20000) {
                    pay = kmPerMonth * 1.45;

        }
        System.out.printf("%.2f",pay * 0.9 * 4);


    }
}
