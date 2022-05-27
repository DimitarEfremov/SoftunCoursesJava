package Basics.ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String track = scanner.nextLine();
        double revenue = 0;


        switch (track) {
            case "trail":
                revenue += juniors * 5.5;
                revenue += seniors *7;
                break;
            case "cross-country":
                revenue += juniors * 8;
                revenue += seniors *9.50;
                if (juniors + seniors >50){
                 revenue *= 0.75;
                }
                break;
            case "downhill":
                revenue += juniors * 12.25;
                revenue += seniors *13.75;
                break;
            case "road":
                revenue += juniors * 20;
                revenue += seniors *21.50;
                break;
        }

        System.out.printf("%.2f",revenue*0.95);
    }
}
