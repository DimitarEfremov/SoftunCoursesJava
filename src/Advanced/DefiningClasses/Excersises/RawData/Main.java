package Advanced.DefiningClasses.Excersises.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        System.out.println();
    }
}
