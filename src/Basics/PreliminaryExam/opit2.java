package Basics.PreliminaryExam;

import java.util.Scanner;

public class opit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double firstRun = Double.parseDouble(scanner.nextLine());

        double nextRun = firstRun;

        double total = 1000 - firstRun;


        for (int i = 1; i <=days ; i++) {
            double distanceIncrease = Double.parseDouble(scanner.nextLine());
            distanceIncrease /= 100;

            nextRun = nextRun + nextRun * distanceIncrease;

            total -=nextRun;

            if (total <=0){
                break;
            }

        }

        if (total <=0){
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.abs(Math.floor(total)));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(total));
        }



    }
}
