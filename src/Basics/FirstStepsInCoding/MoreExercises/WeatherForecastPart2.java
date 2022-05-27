package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperature = Double.parseDouble(scanner.nextLine());


        if (temperature <= 11.9 && temperature >= 5){
            System.out.println("Cold");
        } else if (temperature <= 14.9 && temperature >= 11.9){
            System.out.println("Cool");
        } else if(temperature <= 20 && temperature >= 14.9){
            System.out.println("Mild");
        } else if(temperature <= 25.9 && temperature >= 20){
            System.out.println("Warm");
        } else if(temperature <= 35 && temperature >= 25.9){
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
