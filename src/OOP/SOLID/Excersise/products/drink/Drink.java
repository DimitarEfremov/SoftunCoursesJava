package OOP.SOLID.Excersise.products.drink;

import OOP.SOLID.Excersise.products.CaloricProduct;

public abstract class Drink implements CaloricProduct {

    private double milliliters;
    private double caloriesPer100Grams;
    private double density;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.density = density;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getCalories() {

        double grams = getMilliliters() * density;
        return  (caloriesPer100Grams / 100) * grams;
    }


    @Override
    public double getKilograms(){
        return milliliters*density/1000;
    }

}
