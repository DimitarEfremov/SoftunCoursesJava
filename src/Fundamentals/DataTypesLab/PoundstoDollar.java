package Fundamentals.DataTypesLab;

import java.util.Scanner;

public class PoundstoDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double paund = Double.parseDouble(scanner.nextLine());

        double dollar = paund * 1.36;


        System.out.printf("%.3f",dollar);
    }
}
