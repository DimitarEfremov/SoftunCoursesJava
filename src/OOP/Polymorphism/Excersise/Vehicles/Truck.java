package OOP.Polymorphism.Excersise.Vehicles;


public class Truck extends Vehicle {

    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_DEDUCTION = 0.95;


    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION, tankCapacity);
    }


    @Override
    public void refuel(double litres) {
        super.refuel(litres * FUEL_DEDUCTION);
    }



}
