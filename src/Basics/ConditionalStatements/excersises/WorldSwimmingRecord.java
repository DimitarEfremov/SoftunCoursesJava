package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondPerMeter = Double.parseDouble(scanner.nextLine());

        double lag = Math.floor(distance / 15) * 12.5;

        double IvanTime = distance * secondPerMeter + lag;

        if (IvanTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", IvanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", IvanTime - record);
        }

    }
}
