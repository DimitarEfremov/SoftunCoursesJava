package Advanced.DefiningClasses.Excersises.CarSalesman;

public class EngineForSale {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;


    public EngineForSale() {
    }

    public EngineForSale  (String[] parts){
        model = parts[0];
        power = Integer.parseInt(parts[1]);

        // V4-33 140 28 B

        if (parts.length >= 3){
            if (parts[2].matches("[A-Za-z]")){
                efficiency = parts[2];
            } else {
                displacement = Integer.parseInt(parts[2]);
            }
        }

        if (parts.length == 4){
            efficiency = parts[3];
        }


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
