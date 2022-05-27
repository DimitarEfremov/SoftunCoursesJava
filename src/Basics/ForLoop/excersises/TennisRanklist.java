package Basics.ForLoop.excersises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double w =0;
        double f =0;
        double sf =0;


        for (int i = 1; i <= n; i++) {
            String place = scanner.nextLine();

            switch (place) {
                case "W":
                    w++;
                    break;
                case "F":
                    f++;
                    break;
                case "SF":
                    sf++;
                    break;
            }

        }

        double finalPoints = w*2000 + f*1200 + sf*720;
        double averagePoints = Math.floor(finalPoints/(w+f+sf));
        double wins = w/(w+f+sf);

        System.out.printf("Final points: %.0f%n",finalPoints + startingPoints);
        System.out.printf("Average points: %.0f%n",averagePoints);
        System.out.printf("%.2f%%",wins*100);
    }
}
