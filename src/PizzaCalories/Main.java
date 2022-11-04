package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");

        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        Pizza pizza = null;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] doughData = scanner.nextLine().split("\\s+");

        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        int weightInGrams = Integer.parseInt(doughData[3]);

        Dough dough = null;
        try {
            dough = new Dough(flourType, bakingTechnique, weightInGrams);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }


        if (pizza != null) {
            pizza.setDough(dough);
        }


        String toppingData = scanner.nextLine();

        while (!toppingData.equals("END")) {
            String toppingType = toppingData.split("\\s+")[1];
            int weightInGramsOfTopping = Integer.parseInt(toppingData.split("\\s+")[2]);

            Topping topping = null;
            try {
                topping = new Topping(toppingType, weightInGramsOfTopping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

            if (pizza != null) {
                pizza.addTopping(topping);
            }

            toppingData = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());

    }
}
