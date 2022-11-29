package OOP.SOLID.Excersise;

import OOP.SOLID.Excersise.calculators.Calculator;
import OOP.SOLID.Excersise.products.CaloricProduct;
import OOP.SOLID.Excersise.calculators.CalorieCalculator;

import java.util.List;

public class Printer {


    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

    private Calculator calculator;

    public Printer(Calculator calorieCalculator) {
        this.calculator = calorieCalculator;
    }

    public void printSum(List<CaloricProduct> products) {
        System.out.printf((SUM) + "%n", calculator.sum(products));
    }

    public void printAverage(List<CaloricProduct> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }

}
