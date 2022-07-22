package Fundamentals.ObjectsandClasses.Excersise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLines = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        int totalHorsepowerCars = 0;
        int cars = 0;
        int totalHorsepowerTrucks = 0;
        int trucks = 0;

        while (!inputLines.equals("End")){
            String typeOfVehicle = capitalize(inputLines.split(" ")[0]);
            String model = inputLines.split(" ")[1];
            String color = inputLines.split(" ")[2];
            int horsepower =  Integer.parseInt(inputLines.split(" ")[3]);

            if (typeOfVehicle.equals("Car")){
                totalHorsepowerCars += horsepower;
                cars++;
            } else if (typeOfVehicle.equals("Truck")){
                totalHorsepowerTrucks += horsepower;
                trucks++;
            }

            Vehicle vehicle = new Vehicle(typeOfVehicle, model, color, horsepower);

            vehicleList.add(vehicle);


            inputLines = scanner.nextLine();
        }

        String inputModel = scanner.nextLine();

        while (!inputModel.equals("Close the Catalogue")){

            for (Vehicle vehicle : vehicleList
                 ) {
                if (inputModel.equals(vehicle.getModel())){
                    System.out.println("Type: " + vehicle.getTypeOfVehicle());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getHorsepower());
                }
            }

            inputModel= scanner.nextLine();
        }
        double averageCar = totalHorsepowerCars* 1.00 / cars ;
        double averageTruck = totalHorsepowerTrucks* 1.00 / trucks;

        if (cars == 0){
            averageCar = 0;
        }
        if (trucks == 0){
            averageTruck = 0;
        }



        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCar);
        System.out.printf("Trucks have average horsepower of: %.2f.%n",averageTruck);



    }
}
