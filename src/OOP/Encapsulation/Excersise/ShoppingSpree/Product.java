package OOP.Encapsulation.Excersise.ShoppingSpree;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost (cost);
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("") ){
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setCost(double cost) {
        if (cost < 0){
            throw new IllegalArgumentException("Cost cannot be negative");
        } else {
            this.cost = cost;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
