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
            Car car = new Car();

            car.setBrand(carInfo[0]);
            car.setModel(carInfo[1]);
            car.setHorsePower(Integer.parseInt(carInfo[2]));

            carsQueue.offer(car);

        }

        for (Car car : carsQueue) {
            System.out.println(car.carInfo());
        }

    }
}
