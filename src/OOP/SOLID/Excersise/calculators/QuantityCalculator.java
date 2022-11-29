package OOP.SOLID.Excersise.calculators;

import OOP.SOLID.Excersise.products.CaloricProduct;

import java.util.List;

public class QuantityCalculator implements Calculator {

    public QuantityCalculator() {
    }

    @Override
    public double sum(List<CaloricProduct> products) {
        return products.stream().mapToDouble(CaloricProduct::getKilograms).sum();
    }

    @Override
    public double average(List<CaloricProduct> products) {
        return sum(products) / products.size();
    }
}
