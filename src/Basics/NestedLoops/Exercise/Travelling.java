package Basics.NestedLoops.Exercise;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        while (!country.equals("End")){
            double tripCost = Double.parseDouble(scanner.nextLine());

            double savedCashTotal = 0;
            while (savedCashTotal < tripCost){
                double saved = Double.parseDouble(scanner.nextLine());
                savedCashTotal += saved;
                if(savedCashTotal >= tripCost){
                    System.out.printf("Going to %s!%n",country);
                    break;
                }
            }

            country = scanner.nextLine();
        }
    }
}
