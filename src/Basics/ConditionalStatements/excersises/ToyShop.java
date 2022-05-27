package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double orderPrice = puzzle * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.20 + trucks * 2;
        int toysCount = puzzle + dolls + bears + minions + trucks;

        if (toysCount >= 50) {
            orderPrice = orderPrice * 0.75;
        }

        double revenue = orderPrice - (0.1 * orderPrice);

        Double leftover = Math.abs(revenue - trip);


        if (revenue >= trip){
            System.out.printf("Yes! %.2f lv left.",leftover);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",leftover);
        }

    }
}
