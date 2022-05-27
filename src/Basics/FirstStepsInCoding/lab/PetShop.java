package Basics.FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double dogFoodCount = Double.parseDouble(scanner.nextLine());
        Double catFoodCount = Double.parseDouble(scanner.nextLine());
        Double dogFoodPrice = Double.parseDouble(String.valueOf(2.50));
        Double catFoodPrice = Double.parseDouble(String.valueOf(4));
        Double price =dogFoodCount*dogFoodPrice + catFoodCount*catFoodPrice;

        System.out.println(price + " lv.");
    }
}
