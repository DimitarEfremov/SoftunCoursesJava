package Advanced.SetsandMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carsSet = new LinkedHashSet<>();


        String input = scanner.nextLine();

        while (!input.equals("END")){
            String command = input.split(", ")[0];
            String carPlate = input.split(", ")[1];

            if (command.equals("IN")){
                carsSet.add(carPlate);
            } else if (command.equals("OUT")) {
                carsSet.remove(carPlate);
            }

            input = scanner.nextLine();
        }

        if (carsSet.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : carsSet) {
                System.out.println(s);
            }
        }

    }
}
