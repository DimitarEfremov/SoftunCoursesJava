package Fundamentals.DataTypes.Excersise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int totalYield = 0;
        int days = 0;


        while (yield >= 100){
            totalYield +=yield;
            days++;
            totalYield -=26;
            yield -= 10;

        }

        totalYield -=26;
        if (totalYield <0){
            totalYield = 0;
        }

        System.out.println(days);
        System.out.println(totalYield);

    }
}
