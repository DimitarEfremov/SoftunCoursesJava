package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String car = "";
        String clas = "";

        if (budget <= 100) {
            clas = "Economy class";
            switch (season) {
                case "Summer":
                    price = budget * 0.35;
                    car = "Cabrio";
                    break;
                case "Winter":
                    price = budget * 0.65;
                    car = "Jeep";
                    break;
            }

        } else if (budget <= 500) {
            clas = "Compact class";
            switch (season) {
                case "Summer":
                    price = budget * 0.45;
                    car = "Cabrio";
                    break;
                case "Winter":
                    price = budget * 0.8;
                    car = "Jeep";
                    break;
            }

        } else {
            clas = "Luxury class";
            price = budget * 0.9;
            car = "Jeep";

        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", car, price);
    }
}
