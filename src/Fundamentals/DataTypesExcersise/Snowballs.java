package Fundamentals.DataTypesExcersise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballsAmount = Integer.parseInt(scanner.nextLine());
        double value = Double.MIN_VALUE;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 1; i <=ballsAmount ; i++) {
            int snowballSnow  = Integer.parseInt(scanner.nextLine());
            int snowballTime  = Integer.parseInt(scanner.nextLine());
            int snowballQuality  = Integer.parseInt(scanner.nextLine());



            double snowballValue = Math.pow(snowballSnow/snowballTime,snowballQuality);



            if (snowballValue > value){
                value = snowballValue;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;


            }

        }
        System.out.printf("%d : %d = %.0f (%d)",snow,time,value,quality);
    }
}
