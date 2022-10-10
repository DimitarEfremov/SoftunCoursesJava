package Advanced.DefiningClasses.Excersises.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<CarRD> carRDList = new ArrayList<>();



        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            CarRD car = new CarRD();

            car.createNewCar(input);

            carRDList.add(car);

        }

        String command = scanner.nextLine();
        List<CarRD> usableCars = new ArrayList<>();

        switch (command){
            case "fragile":

                usableCars = carRDList.stream().filter(carRD -> carRD.cargo.getCargoType().equals("fragile")).filter(carRD -> carRD.tires.tirePressureTest()).collect(Collectors.toList());
                break;
            case "flamable":
                usableCars = carRDList.stream().filter(carRD -> carRD.cargo.getCargoType().equals("flamable")).filter(carRD -> carRD.getEngine().getEnginePower() > 250 ).collect(Collectors.toList());
                break;

        }


        usableCars.forEach(carRD -> System.out.println(carRD.getModel()));
    }
}
