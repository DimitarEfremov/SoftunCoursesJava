package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        Double kec = period - period * 0.4;
        Double ekip = kec - kec * 0.2;
        Double topka = 0.25 * ekip;
        Double aksesoari = 0.2 * topka;

        Double result = period + kec + ekip + topka + aksesoari;
        System.out.println(result);

    }
}
