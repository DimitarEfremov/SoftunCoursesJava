package Fundamentals.BasycSyntax.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String weekday = scanner.nextLine();

        double price = 0;

        if (type.equals("Students")) {
            switch (weekday) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }

        } else if (type.equals("Business")) {
            switch (weekday) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16;
                    break;
            }

        } else if (type.equals("Regular")) {
            switch (weekday) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday":
                    price = 20;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }

        }

        if (type.equals("Students") && groupNumber >= 30) {
            price = price * 0.85;
        }
        if (type.equals("Business") && groupNumber >= 100) {
            groupNumber -= 10;
        }
        if (type.equals("Regular") && groupNumber >= 10 && groupNumber <= 20) {
            price = price * 0.95;
        }

        double totalPrice = groupNumber * price;


        System.out.printf("Total price: %.2f", totalPrice);
    }
}
