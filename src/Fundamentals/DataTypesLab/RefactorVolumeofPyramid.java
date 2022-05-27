package Fundamentals.DataTypesLab;

import java.util.Scanner;

public class RefactorVolumeofPyramid {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        System.out.print("Length: ");

        double len = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");

        double widht = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");

        double height = Double.parseDouble(scanner.nextLine());

        double result = (len * widht * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", result);
    }
}
