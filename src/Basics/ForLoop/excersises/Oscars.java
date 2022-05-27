package Basics.ForLoop.excersises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            String judge = scanner.nextLine();
            double pointsToGive = Double.parseDouble(scanner.nextLine());

            points += ((judge.length() * pointsToGive) / 2);

            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }


        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - points);
        }

    }
}
