package Fundamentals.FinalExamPreparation.SecondPrep;

import java.util.*;

public class NeedforSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer >> carsMap = new LinkedHashMap<>();


        for (int i = 0; i <n ; i++) {
        String inputCar = scanner.nextLine();
            String car = inputCar.split("\\|")[0];
            int mileage = Integer.parseInt(inputCar.split("\\|")[1]);
            int fuel = Integer.parseInt(inputCar.split("\\|")[2]);

            List<Integer> carDataList = new ArrayList<>();
            carDataList.add(mileage);
            carDataList.add(fuel);

            carsMap.put(car,carDataList);


        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){
            if (command.contains("Drive ")){

                String carCommand = command.split(" : ")[1];
                int distanceCommand = Integer.parseInt(command.split(" : ")[2]);
                int fuelCommand = Integer.parseInt(command.split(" : ")[3]);

                int carDistance = carsMap.get(carCommand).get(0);
                int carFuel = carsMap.get(carCommand).get(1);

                if (carFuel<fuelCommand){
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    List<Integer> updatedCarData = new ArrayList<>();
                    updatedCarData.add(carDistance+distanceCommand);
                    updatedCarData.add(carFuel-fuelCommand);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",carCommand,distanceCommand,fuelCommand);
                    if ((carDistance+distanceCommand)>100000){
                        carsMap.remove(carCommand);
                        System.out.printf("Time to sell the %s!%n",carCommand);
                    } else {
                        carsMap.put(carCommand,updatedCarData);
                    }
                }
            }

            if (command.contains("Refuel ")){
                String carCommand = command.split(" : ")[1];
                int fuelCommand = Integer.parseInt(command.split(" : ")[2]);

                int carDistance = carsMap.get(carCommand).get(0);
                int carFuel = carsMap.get(carCommand).get(1);

                List<Integer> updatedCarData = new ArrayList<>();
                updatedCarData.add(carDistance);

                if (fuelCommand+carFuel <= 75){
                    updatedCarData.add(fuelCommand+carFuel);
                    System.out.printf("%s refueled with %d liters%n",carCommand,fuelCommand);
                } else {
                    updatedCarData.add(75);
                    System.out.printf("%s refueled with %d liters%n",carCommand,75-carFuel);
                }
                carsMap.put(carCommand,updatedCarData);
            }
            if (command.contains("Revert")){
                String carCommand = command.split(" : ")[1];
                int distanceCommand = Integer.parseInt(command.split(" : ")[2]);

                int carDistance = carsMap.get(carCommand).get(0);
                int carFuel = carsMap.get(carCommand).get(1);

                List<Integer> updatedCarData = new ArrayList<>();


                if ((carDistance-distanceCommand < 10000)){
                    updatedCarData.add(10000);
                } else {
                    updatedCarData.add(carDistance-distanceCommand);
                    System.out.printf("%s mileage decreased by %d kilometers%n",carCommand,distanceCommand);
                }
                updatedCarData.add(carFuel);
                carsMap.put(carCommand,updatedCarData);

            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : carsMap.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue().get(0);
            int fuel = entry.getValue().get(1);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",car,mileage,fuel);
        }

    }
}
