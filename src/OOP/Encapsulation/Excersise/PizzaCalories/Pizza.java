package OOP.Encapsulation.Excersise.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int numberOfToppings){
        if (numberOfToppings <0 || numberOfToppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        } else {
            toppings = new ArrayList<>();
        }

    }

    private void setName(String name) {
        if (name.trim().equals("") || name.length()>15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            this.name = name;
        }

    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getOverallCalories(){
        double totalCalories = 0;
        for (Topping topping : toppings) {
            totalCalories += topping.calculateCalories();
        }

        totalCalories+= dough.calculateCalories();

        return totalCalories;
    }
}
