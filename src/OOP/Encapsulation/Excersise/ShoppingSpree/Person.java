package OOP.Encapsulation.Excersise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public void buyProduct(Product product) {
        double price = product.getCost();
        if (this.money >= price) {
            products.add(product);
            setMoney(this.money - price);
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", name, product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");

        if (products.isEmpty()) {
            sb.append("Nothing bought");
        } else {
            sb.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }

        return sb.toString();
    }
}
