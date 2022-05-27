package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radian = Double.parseDouble(scanner.nextLine());
        Double math = 180 / Math.PI;
        Double degree = radian * math;

        System.out.println(degree);
    }
}
