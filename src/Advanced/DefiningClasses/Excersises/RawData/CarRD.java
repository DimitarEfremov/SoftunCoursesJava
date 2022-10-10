package Advanced.DefiningClasses.Excersises.RawData;

import Advanced.DefiningClasses.Excersises.RawData.CarParts.Cargo;
import Advanced.DefiningClasses.Excersises.RawData.CarParts.Engine;
import Advanced.DefiningClasses.Excersises.RawData.CarParts.Tires;

public class CarRD {

    String model;
    Engine engine;
    Cargo cargo;
    Tires tires;


    public CarRD createNewCar (String[] strings){

      // "{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType} {Tire1Pressure} {Tire1Age} {Tire2Pressure} {Tire2Age} {Tire3Pressure} {Tire]’3Age} {Tire4Pressure} {Tire4Age}",

        int n = 0;


        String model = strings[n++];
        int engineSpeed = Integer.parseInt(strings[n++]);
        int enginePower = Integer.parseInt(strings[n++]);
        int cargoWeight = Integer.parseInt(strings[n++]);
        String cargoType = strings[n++];
        double tire1Pressure = Double.parseDouble(strings[n++]);
        int tire1Age = Integer.parseInt(strings[n++]);
        double tire2Pressure = Double.parseDouble(strings[n++]);
        int tire2Age = Integer.parseInt(strings[n++]);
        double tire3Pressure = Double.parseDouble(strings[n++]);
        int tir3Age = Integer.parseInt(strings[n++]);
        double tire4Pressure = Double.parseDouble(strings[n++]);
        int tire4Age = Integer.parseInt(strings[n]);

        this.model = model;
        engine = new Engine(engineSpeed,enginePower);
        cargo = new Cargo(cargoWeight,cargoType);
        tires = new Tires(tire1Pressure,tire1Age, tire2Pressure,tire2Age, tire3Pressure, tir3Age, tire4Pressure, tire4Age  );

        return new CarRD();
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
