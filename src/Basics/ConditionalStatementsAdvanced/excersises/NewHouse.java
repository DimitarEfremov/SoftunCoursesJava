package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.next();
        int amount = Integer.parseInt(scanner.next());
        int budget = Integer.parseInt(scanner.next());

        double price = 0;

        switch (flower) {
            case "Roses":
                if (amount <= 80) {
                    price = amount * 5;
                } else {
                    price = amount * 5 * 0.9;
                }
                break;
            case "Dahlias":
                if (amount <= 90) {
                    price = amount * 3.8;
                } else {
                    price = amount * 3.8 * 0.85;
                }
                break;
            case "Tulips":
                if (amount <= 80) {
                    price = amount * 2.8;
                } else {
                    price = amount * 2.8 * 0.85;
                }
                break;
            case "Narcissus":
                if (amount < 120) {
                    price = amount * 3 * 1.15;
                } else {
                    price = amount * 3;
                }
                break;
            case "Gladiolus":
                if (amount < 80) {
                    price = amount * 2.5 * 1.2;
                } else {
                    price = amount * 2.5;
                }
                break;

        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }


    }
}
