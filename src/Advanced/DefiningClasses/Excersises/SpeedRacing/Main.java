package Advanced.DefiningClasses.Excersises.SpeedRacing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Set<CarSR> carSet = new LinkedHashSet<>();

    int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] information = scanner.nextLine().split("\\s+");
            String model = information[0];
            double fuelAmount = Double.parseDouble(information[1]);
            double fuelCostPer1km = Double.parseDouble(information[2]);

            CarSR newCar = new CarSR(model,fuelAmount,fuelCostPer1km);
            carSet.add(newCar);

        }

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputParts = input.split("\\s+");

            String carModel = inputParts[1];
            int amountOfKm = Integer.parseInt(inputParts[2]);

            CarSR currentCar = carSet.stream().filter(carSR -> carSR.getModel().equals(carModel)).findAny().get();

            if (!hasFuel(currentCar,amountOfKm)){
                System.out.println("Insufficient fuel for the drive");
            } else {
                currentCar.setFuelAmount(currentCar.getFuelAmount()- amountOfKm* currentCar.getFuelCostFor1km());
                currentCar.setKilometersTraveled(currentCar.getKilometersTraveled() + amountOfKm);
            }

            carSet.add(currentCar);



            input = scanner.nextLine();
        }

            carSet.forEach(c -> System.out.println(c.carInfo()));

    }

    private static boolean hasFuel(CarSR car, int amountOfKm) {
        
        return car.getFuelAmount()>= car.getFuelCostFor1km()*amountOfKm;
    }


}
