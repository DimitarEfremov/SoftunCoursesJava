package OOP.Polymorphism.Excersise.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] animalInput = scanner.nextLine().split(" ");
        String[] foodInput = scanner.nextLine().split(" ");


        Animal animal = extractAnimal(animalInput);

        Food food = extractFood(foodInput);

        animal.makeSound();
        animal.eat(food);
        System.out.println(animal);


    }

    private static Food extractFood(String[] foodInput) {

        String foodType = foodInput[0];
        Integer quantity = Integer.valueOf(foodInput[1]);

        if (foodType.equals("Vegetable")){
           return new Vegetable(quantity);
        } else if (foodType.equals("Meat")){
           return  new Meat(quantity);
        }
       return null;
    }

    private static Animal extractAnimal(String[] animalInput) {
        String animalType = animalInput[0];
        String animalName = animalInput[1];
        double animalWeight = Double.parseDouble(animalInput[2]);
        String animalLivingRegion = animalInput[3];
        switch (animalType) {
            case "Cat":
                String catBreed = animalInput[4];
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);

        }
        return null;
    }
}
