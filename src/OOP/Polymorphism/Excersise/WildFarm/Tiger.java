package OOP.Polymorphism.Excersise.WildFarm;

public class Tiger extends Feline{

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        String foodLiked = "Meat";
        if (foodLiked.equals(food.getClass().getSimpleName())){
            setFoodEaten(food.getQuantity());
        } else {
            System.out.printf("%ss are not eating that type of food!%n",getClass().getSimpleName());
        }

    }
}
