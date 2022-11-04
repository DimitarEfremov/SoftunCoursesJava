package OOP.Encapsulation.Excersise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split(" ");

        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);

        String[] doughData = scanner.nextLine().split(" ");

        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double weightInGrams = Double.parseDouble(doughData[3]);



        try {
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);

            Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);

            pizza.setDough(dough);


            String toppingData = scanner.nextLine();

            while (!toppingData.equals("END")) {
                String toppingType = toppingData.split(" ")[1];
                int weightInGramsOfTopping = Integer.parseInt(toppingData.split(" ")[2]);

                Topping topping = new Topping(toppingType, weightInGramsOfTopping);

                pizza.addTopping(topping);

                toppingData = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }




    }
}
