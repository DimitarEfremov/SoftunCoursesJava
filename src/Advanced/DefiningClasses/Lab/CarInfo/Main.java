package Advanced.DefiningClasses.Lab.CarInfo;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Car> carsQueue = new ArrayDeque<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");

            Car car =
                    carInfo.length == 1
                            ? new Car(carInfo[0])
                            : new Car(carInfo[0],carInfo[1],Integer.parseInt(carInfo[2]));

            carsQueue.offer(car);

        }

        for (Car car : carsQueue) {
            System.out.println(car.carInfo());
        }

    }
}
