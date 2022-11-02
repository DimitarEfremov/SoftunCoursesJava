package OOP.Encapsulation.Excersise.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15 ){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {

        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double productivity = 0;

        if (age <= 5) {
            productivity = 2;
        } else if (age <= 12) {
            productivity = 1;
        } else {
            productivity = 0.75;
        }
        return productivity;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name, age, productPerDay());
    }
}
