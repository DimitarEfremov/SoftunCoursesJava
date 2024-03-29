package OOP.Encapsulation.Excersise.PizzaCalories;

import java.util.Arrays;
import java.util.List;

public class Topping {

    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        List<String> validTopics = Arrays.asList("Meat", "Veggies", "Cheese", "Sauce");
        if (!validTopics.contains(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        } else {
            this.toppingType = toppingType;
        }


    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        } else {
            this.weight = weight;
        }

    }

    public double calculateCalories() {

        switch (toppingType) {
            case "Meat ":
                return weight * 1.2 * 2;
            case "Veggies":
                return weight * 0.8 * 2;
            case "Cheese":
                return weight * 1.1 * 2;
            case "Sauce":
                return weight * 0.9 * 2;
            default:
                return 0;

        }
    }

}
