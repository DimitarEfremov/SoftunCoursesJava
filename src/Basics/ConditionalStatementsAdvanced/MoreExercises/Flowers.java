package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double totalPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                totalPrice += hrizantemi * 2;
                totalPrice += roses * 4.1;
                totalPrice += tulips * 2.5;

                if (holiday.equals("Y")) {
                    totalPrice *= 1.15;
                }
                if (tulips > 7 && season.equals("Spring")) {
                    totalPrice *= 0.95;
                }
                break;
            case "Autumn":
            case "Winter":
                totalPrice += hrizantemi * 3.75;
                totalPrice += roses * 4.5;
                totalPrice += tulips * 4.15;

                if (holiday.equals("Y")) {
                    totalPrice *= 1.15;
                }
                if (roses > 7 && season.equals("Winter")) {
                    totalPrice *= 0.9;
                }
                break;

        }
        if (hrizantemi + roses + tulips > 20) {
            totalPrice *= 0.8;
        }
        totalPrice += 2;

        System.out.printf("%.2f", totalPrice);

    }
}
