package Basics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scanner.nextLine());
        int debitPipe1 = Integer.parseInt(scanner.nextLine());
        int debitPipe2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double water = (debitPipe1 + debitPipe2) * time;

        if (water <= poolVolume){
            double percentageFilled = water / poolVolume * 100;
            double pipeOnePercentage = (debitPipe1 * time) / water * 100;
            double pipeTwoPercentage = (debitPipe2 * time) / water * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",percentageFilled,pipeOnePercentage,pipeTwoPercentage);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, water - poolVolume);
        }

    }
}
