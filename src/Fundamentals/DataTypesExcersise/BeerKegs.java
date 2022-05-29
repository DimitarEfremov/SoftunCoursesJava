package Fundamentals.DataTypesExcersise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegs = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double maxVolume = Double.MIN_VALUE;

        for (int i = 1; i <= kegs ; i++) {
            String model = scanner.nextLine();

            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(r,2) * h;

            if (volume > maxVolume){
                maxVolume = volume;
                biggestKeg = model;
            }


        }
        System.out.println(biggestKeg);
    }
}
