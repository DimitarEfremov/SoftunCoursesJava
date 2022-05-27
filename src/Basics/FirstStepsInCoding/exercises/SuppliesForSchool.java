package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double pens = Double.parseDouble(scanner.nextLine());
        Double markers = Double.parseDouble(scanner.nextLine());
        Double detergent = Double.parseDouble(scanner.nextLine());
        Double discount = Double.parseDouble(scanner.nextLine());
        Double realdiscount  = discount / 100;

        Double pensPrice = pens * 5.8;
        Double markersPrice = markers * 7.2;
        Double detergentPrice = detergent * 1.2;

        Double Total = ( pensPrice + markersPrice + detergentPrice );
        Double FinalPrice = Total - (Total*realdiscount);

        System.out.println(FinalPrice);


    }
}
