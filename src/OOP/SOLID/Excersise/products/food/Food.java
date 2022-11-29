package OOP.SOLID.Excersise.products.food;

import OOP.SOLID.Excersise.products.CaloricProduct;

public abstract class Food implements CaloricProduct {

    private double grams;
    private double caloriesPer100Grams;

    public Food(double grams, double caloriesPer100Grams) {
        this.grams = grams;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double getCalories() {

        return  (caloriesPer100Grams / 100) * getGrams();
    }

    @Override
    public double getKilograms(){
        return grams/1000;
    }

}
