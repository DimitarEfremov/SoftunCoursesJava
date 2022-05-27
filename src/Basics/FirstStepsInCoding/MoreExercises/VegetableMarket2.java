package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vPR = Double.parseDouble(scanner.nextLine());
        double fPR = Double.parseDouble(scanner.nextLine());
        double vKG = Double.parseDouble(scanner.nextLine());
        double fKG = Double.parseDouble(scanner.nextLine());

        double price = ((vPR * vKG) + (fKG * fPR))/1.94;

        System.out.printf("%.2f",price);


    }
}
