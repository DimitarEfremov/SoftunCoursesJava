package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double costumeCost = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double totalCostume = statists * costumeCost;

        if (statists > 150) {
            totalCostume = totalCostume * 0.9;
        }

        double leftover = Math.abs(budget - totalCostume - decor);

        if (budget < totalCostume + decor){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", leftover);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftover);
        }

    }
}
