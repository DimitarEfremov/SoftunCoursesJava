package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.next();
        int nighs = Integer.parseInt(scanner.next());

        double priceApartment = 0;
        double priceStudio = 0;


        switch (month) {
            case "May":
            case "October":
                priceStudio = nighs  * 50;
                priceApartment = nighs  * 65;
                if ( nighs > 7 && nighs <=14){
                    priceStudio = priceStudio * 0.95;
                }
                if (nighs >14){
                    priceStudio = priceStudio * 0.7;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "June":
            case "September":
                priceStudio = nighs  * 75.20;
                priceApartment = nighs  * 68.70;
                if ( nighs > 14){
                    priceStudio = priceStudio * 0.8;
                    priceApartment = priceApartment * 0.9;
                }
                break;
            case "July":
            case "August":
                priceStudio = nighs  * 76;
                priceApartment = nighs  * 77;
                if ( nighs > 14){
                    priceApartment = priceApartment * 0.9;
                }
                break;

        }
        System.out.printf("Apartment: %.2f lv.%n",priceApartment);
        System.out.printf("Studio: %.2f lv.%n",priceStudio);
    }
}
