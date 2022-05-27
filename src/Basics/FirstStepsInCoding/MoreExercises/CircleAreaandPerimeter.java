package Basics.FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double face = Math.PI * Math.pow(r,2);
        double radius = 2 * Math.PI * r;

        System.out.printf("%.2f%n",face);
        System.out.printf("%.2f",radius);

    }
}
