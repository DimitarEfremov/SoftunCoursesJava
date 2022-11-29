package OOP.SOLID.Excersise.calculators;

import OOP.SOLID.Excersise.products.CaloricProduct;

import java.util.List;

public class CalorieCalculator implements Calculator {


    public CalorieCalculator() {
    }

    @Override
    public double sum(List<CaloricProduct> products) {
        double sum = 0;

        for (CaloricProduct product : products) {
                sum += product.getCalories();
        }

        return sum;
    }

    @Override
    public double average(List<CaloricProduct> products) {
        return sum(products) / products.size();
    }


}
