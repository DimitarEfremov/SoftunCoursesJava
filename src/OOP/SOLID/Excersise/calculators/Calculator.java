package OOP.SOLID.Excersise.calculators;

import OOP.SOLID.Excersise.products.CaloricProduct;

import java.util.List;

public interface Calculator {

    double sum(List<CaloricProduct> products);
    double average(List<CaloricProduct> products);
}
