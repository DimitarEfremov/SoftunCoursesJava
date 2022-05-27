package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task4Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double firstRun = Double.parseDouble(scanner.nextLine());

        double total = firstRun;
        double nextRun = firstRun;

        boolean success = false;


        for (int i = 1; i <= days ; i++) {
            double distanceIncrease = Double.parseDouble(scanner.nextLine());
            distanceIncrease /= 100;

            nextRun = nextRun + nextRun * distanceIncrease;


            total += nextRun;

            if (total >= 1000) {
                success = true;
                break;
            }

        }

        if (success) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(total - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - total));
        }

    }
}
