package Basics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365- restDays;

        int playTime = (restDays * 127 + workDays * 63);
        int difference = Math.abs(playTime - 30000);

        if (playTime > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", difference/60,difference%60);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", difference/60,difference%60);
        }


    }
}
