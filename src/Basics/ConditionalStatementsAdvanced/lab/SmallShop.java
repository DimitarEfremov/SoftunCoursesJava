package Basics.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = amount * 0.5;
                    break;
                case "water":
                    price = amount * 0.8;
                    break;
                case "beer":
                    price = amount * 1.2;
                    break;
                case "sweets":
                    price = amount * 1.45;
                    break;
                case "peanuts":
                    price = amount * 1.6;
                    break;
            }
        } else if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = amount * 0.4;
                    break;
                case "water":
                    price = amount * 0.7;
                    break;
                case "beer":
                    price = amount * 1.15;
                    break;
                case "sweets":
                    price = amount * 1.3;
                    break;
                case "peanuts":
                    price = amount * 1.5;
                    break;
            }
        } else if (town.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = amount * 0.45;
                    break;
                case "water":
                    price = amount * 0.7;
                    break;
                case "beer":
                    price = amount * 1.1;
                    break;
                case "sweets":
                    price = amount * 1.35;
                    break;
                case "peanuts":
                    price = amount * 1.55;
                    break;
            }
        }

        System.out.println(price);

    }
}
