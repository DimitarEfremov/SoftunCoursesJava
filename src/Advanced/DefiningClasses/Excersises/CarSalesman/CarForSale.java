package Advanced.DefiningClasses.Excersises.CarSalesman;

import java.util.Arrays;
import java.util.List;

public class CarForSale {

    private String model;
    private EngineForSale engine;
    private int weight;
    private  String color;


    public CarForSale(String[] params, List<EngineForSale> enginesList){
        model = params[0];

        for (EngineForSale e : enginesList) {
            if (params[1].equals(e.getModel())) {
                this.engine = e;
            }
        }

        if (params.length >= 3){
            if (params[2].matches("[0-9]+")){
                weight = Integer.parseInt(params[2]);
            } else {
                color = params[2];
            }
        }

        if (params.length == 4){
            color = params[3];
        }
    }


    public void carInfoPrint() {
        System.out.printf("%s:%n",model);
        System.out.printf("%s:%n",engine.getModel());
        System.out.println("Power: " + engine.getPower());
        if (engine.getDisplacement() == 0){
            System.out.println("Displacement: n/a");
        } else {
            System.out.printf("Displacement: %d%n",engine.getDisplacement());
        }
        if (engine.getEfficiency() == null){
            System.out.println("Efficiency: n/a");
        } else {
            System.out.printf("Efficiency: %s%n",engine.getEfficiency());
        }
        if (weight == 0){
            System.out.println("Weight: n/a");
        } else{
            System.out.printf("Weight: %d%n",weight);
        }
        if (color == null){
            System.out.println("Color: n/a");
        } else {
            System.out.printf("Color: %s%n",color);
        }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineForSale getEngine() {
        return engine;
    }

    public void setEngine(EngineForSale engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
