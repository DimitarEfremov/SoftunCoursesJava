package Advanced.DefiningClasses.Excersises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enginesN = scanner.nextInt();
        scanner.nextLine();

        List<EngineForSale>  enginesList = new ArrayList<>();
        List<CarForSale> carsList = new ArrayList<>();

        for (int i = 0; i < enginesN; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");

            EngineForSale engine = new EngineForSale(engineInfo);

            enginesList.add(engine);

        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <m ; i++) {
            String[] carParams = scanner.nextLine().split("\\s+");

            CarForSale car = new CarForSale(carParams,enginesList);

            carsList.add(car);

        }


        carsList.forEach(CarForSale::carInfoPrint);
    }
}
