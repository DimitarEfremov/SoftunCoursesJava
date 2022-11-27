package OOP.Polymorphism.Excersise.Vehicles;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);
        Vehicle truck = getVehicle(scanner);
        Vehicle bus = getVehicle(scanner);

        Map<String, Vehicle> vehicleMap = new HashMap<>();

        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String vehicleType = input[1];
            double argument = Double.parseDouble(input[2]);

            switch (command) {
                case "DriveEmpty":
                    Bus bus2 = (Bus) vehicleMap.get(vehicleType);
                    System.out.println(bus2.driveEmpty(argument));
                    break;
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    try {
                        vehicleMap.get(vehicleType).refuel(argument);
                    } catch (IllegalArgumentException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] carInfo = scanner.nextLine().split(" ");
        String vehicleType = carInfo[0];
        double carFuel = Double.parseDouble(carInfo[1]);
        double carConsumption = Double.parseDouble(carInfo[2]);
        double tankCapacity = Double.parseDouble(carInfo[3]);

        switch (vehicleType){
            case "Car":
                Vehicle car = new Car(carFuel, carConsumption,tankCapacity);
                return car;
            case "Truck":
                Vehicle truck = new Truck(carFuel, carConsumption, tankCapacity);
                return truck;
            case "Bus":
                Vehicle bus = new Bus(carFuel, carConsumption, tankCapacity);
                return bus;

        }

        return null;
    }
}
