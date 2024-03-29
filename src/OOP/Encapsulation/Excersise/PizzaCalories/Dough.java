package OOP.Encapsulation.Excersise.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;


    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            this.flourType = flourType;
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        } else {
            this.bakingTechnique = bakingTechnique;
        }

    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        } else {
            this.weight = weight;
        }

    }

    public double calculateCalories() {
        double result = 0;

        if (flourType.equals("White")) {
            result = weight * 1.5;
        } else if (flourType.equals("Wholegrain")) {
            result = weight;
        }

        if (bakingTechnique.equals("Crispy")) {
            result *= 0.9;
        } else if (bakingTechnique.equals("Chewy")) {
            result *= 1.1;
        } else if (bakingTechnique.equals("Homemade")) {
            result = result;
        }
        return result * 2;
    }
}
