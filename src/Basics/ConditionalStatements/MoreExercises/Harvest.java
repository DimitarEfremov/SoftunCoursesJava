package Basics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyard = Integer.parseInt(scanner.nextLine());
        double grapeCrop = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double grapeForWine = (vineyard * grapeCrop) * 0.4;
        double wineProduced = grapeForWine / 2.5;

        if (wineProduced < wineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded - wineProduced));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineProduced));
            System.out.printf("%.0f liters left -> %.0f liters per person.", wineProduced - wineNeeded, Math.ceil(wineProduced - wineNeeded) / workers);
        }


    }
}
