package Fundamentals.MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aInput = Double.parseDouble(scanner.nextLine());
        double bInput = Double.parseDouble(scanner.nextLine());

        double result = rectangleCalculatedArea(aInput, bInput);

        System.out.printf("%.0f", result);
    }

    public static double rectangleCalculatedArea(double a, double b){

        return a * b;
    }
}
