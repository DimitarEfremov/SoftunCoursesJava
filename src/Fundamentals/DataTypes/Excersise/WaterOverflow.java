package Fundamentals.DataTypes.Excersise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;

        int n = Integer.parseInt(scanner.nextLine());
        int liters = 0;

        for (int i = 1; i <=n ; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            capacity -= water;
            if (capacity >=0){
                liters += water;
            } else {
                System.out.println("Insufficient capacity!");
                capacity+=water;
            }
        }
        System.out.println(liters);
    }
}
