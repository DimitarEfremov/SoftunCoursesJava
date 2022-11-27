package OOP.Polymorphism.Excersise.Vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    public final static double AC_ADDITIONAL_CONSUMPTION = 1.4;


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * (getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
        if (getFuelQuantity()>=fuelNeeded){
            setFuelQuantity(getFuelQuantity()-fuelNeeded);
            DecimalFormat df = new DecimalFormat("##.##");
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
        }
        return String.format("%s needs refueling",this.getClass().getSimpleName());
    }

    public String driveEmpty(double distance) {

        return super.drive(distance);
    }
}
