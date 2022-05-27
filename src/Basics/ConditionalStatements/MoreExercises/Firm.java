package Basics.ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int dayAvailable = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double hoursWorked = Math.floor(dayAvailable * employees) * 0.9;

        if (hoursWorked>=hoursNeeded){
            System.out.printf("Yes! %.0f hours left.", hoursWorked - hoursNeeded);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hoursNeeded-hoursWorked);
        }
    }
}
