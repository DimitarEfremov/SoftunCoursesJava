package Basics.FirstStepsInCoding.lab;

import java.util.Scanner;

public class IncehsToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
        Double Centemeters = Double.parseDouble(String.valueOf(2.54));

        Double result = inches * Centemeters;
        System.out.println(result);
    }
}
