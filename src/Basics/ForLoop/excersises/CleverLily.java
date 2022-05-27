package Basics.ForLoop.excersises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMprice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysNumber = 0;
        double moneyGifts = 10;
        double sum = 0;


        for (int i = 1; i <=age; i++){
            if (i % 2 == 0 ){
                sum += moneyGifts - 1;
                moneyGifts += 10;
            } else {
                toysNumber++;
            }
        }

        sum += (toysNumber * toyPrice);

        if (washingMprice <= sum){
            System.out.printf("Yes! %.2f",sum - washingMprice);
        } else {
            System.out.printf("No! %.2f", washingMprice - sum);
        }
    }
}
