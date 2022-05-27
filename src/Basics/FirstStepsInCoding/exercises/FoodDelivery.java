package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Chicken = Integer.parseInt(scanner.nextLine());
        int Fish = Integer.parseInt(scanner.nextLine());
        int Veggie = Integer.parseInt(scanner.nextLine());
        Double PriceChicken = Chicken * 10.35;
        Double PriceFish = Fish * 12.40;
        Double PriceVeggie = Veggie * 8.15;

        Double Food = ( PriceChicken + PriceVeggie + PriceFish);
        Double Dessert = Food * 0.2;

        Double Bill = Food + Dessert + 2.5;

        System.out.println(Bill);
    }
}
