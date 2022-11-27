package OOP.Polymorphism.Excersise.Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle implements VehicleBehavior {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;



    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelConsumption(fuelConsumption);
        setFuelQuantity(fuelQuantity);
        setTankCapacity(tankCapacity);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {

        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * getFuelConsumption();
        if (getFuelQuantity()>=fuelNeeded){
            setFuelQuantity(getFuelQuantity()-fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
        }
        return String.format("%s needs refueling",this.getClass().getSimpleName());

    }

    public void refuel(double litres) {
        if (litres<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (litres+getFuelQuantity()>tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        setFuelQuantity( getFuelQuantity() + litres);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",getClass().getSimpleName(),getFuelQuantity());
    }
}
