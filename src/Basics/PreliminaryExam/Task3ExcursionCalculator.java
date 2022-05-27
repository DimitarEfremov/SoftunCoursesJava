package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task3ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if (group <= 5) {
            switch (season) {
                case "spring":
                    price = 50;
                    break;
                case "summer":
                    price = 48.5;
                    break;
                case "autumn":
                    price = 60;
                    break;
                case "winter":
                    price = 86;
                    break;
            }

        } else {
            switch (season) {
                case "spring":
                    price = 48;
                    break;
                case "summer":
                    price = 45;
                    break;
                case "autumn":
                    price = 49.5;
                    break;
                case "winter":
                    price = 85;
                    break;
            }

        }

        double finalPrice = group * price;

        if (season.equals("summer")){
            finalPrice *= 0.85;
        } else if (season.equals("winter")){
            finalPrice *= 1.08;
        }


        System.out.printf("%.2f leva.", finalPrice);
    }
}
