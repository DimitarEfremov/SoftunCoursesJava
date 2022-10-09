package Advanced.DefiningClasses.Excersises.SpeedRacing;


public class CarSR  {

    private String model;
    private double fuelAmount;
    private double fuelCostFor1km;
    private int kilometersTraveled;

    public CarSR (String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.kilometersTraveled = 0;
    }

    public String carInfo(){

        return String.format("%s %.2f %d",model,fuelAmount,kilometersTraveled);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostFor1km() {
        return fuelCostFor1km;
    }

    public void setFuelCostFor1km(double fuelCostFor1km) {
        this.fuelCostFor1km = fuelCostFor1km;
    }

    public int getKilometersTraveled() {
        return kilometersTraveled;
    }

    public void setKilometersTraveled(int kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }
}
