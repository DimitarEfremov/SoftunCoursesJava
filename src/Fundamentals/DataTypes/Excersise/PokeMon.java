package Fundamentals.DataTypes.Excersise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int startPower = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokes = 0;

        while (pokePower >= distance) {

            pokePower -= distance;
            pokes++;
            if (pokePower == startPower * 0.5) {
                if (exhaustionFactor != 0) {
                    pokePower /= exhaustionFactor;
                }
            }


        }

        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
