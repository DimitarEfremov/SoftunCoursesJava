package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daljina = Integer.parseInt(scanner.nextLine());
        int shirina = Integer.parseInt(scanner.nextLine());
        int visochina = Integer.parseInt(scanner.nextLine());
        Double waste =  Double.parseDouble(scanner.nextLine());
        Double wastePercentage = waste * 0.01;

        int volumeCM = daljina * visochina * shirina;
        Double litre = volumeCM * 0.001;

        Double result = litre - (litre * wastePercentage);

        System.out.println(result);
    }
}
