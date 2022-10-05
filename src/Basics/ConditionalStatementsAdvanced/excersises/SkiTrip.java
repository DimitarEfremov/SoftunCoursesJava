package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();


        days = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one Person":
                price = days * 18;
                if (score.equals("positive")){
                    price = price * 1.25;
                }
                if (score.equals("negative")) {
                    price = price * 0.9;
                }
                break;
            case "apartment":
                if (days <10){
                    price = days * 25 * 0.7;
                } else if (days <= 15){
                    price = days * 25 * 0.65;
                } else {
                    price = days * 25 * 0.5;
                }
                if (score.equals("positive")){
                    price = price * 1.25;
                }
                if (score.equals("negative")) {
                    price = price * 0.9;
                }
                break;
            case "president apartment":
                if (days <10){
                    price = days * 35 * 0.9;
                } else if (days <= 15){
                    price = days * 35 * 0.85;
                } else {
                    price = days * 35 * 0.8;
                }
                if (score.equals("positive")){
                    price = price * 1.25;
                }
                if (score.equals("negative")) {
                    price = price * 0.9;
                }
                break;
        }

        System.out.printf("%.2f", price);

    }
}
