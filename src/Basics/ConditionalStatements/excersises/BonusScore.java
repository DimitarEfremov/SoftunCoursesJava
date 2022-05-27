package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initial = Integer.parseInt(scanner.nextLine());

        double bonus1 = 0;
        double bonus2 = 0;
        double bonus3 = 0;


        if (initial < 100) {
            bonus1 = 5;
        } else if (initial < 1000) {
            bonus1 = initial * 0.2;
        } else if (initial > 1000) {
            bonus1 = initial * 0.1;
        }

        if (initial % 2 != 1) {
            bonus2 = 1;
        }
        if (initial % 10 == 5) {
            bonus3 = 2;
        }
        double totalBonus = (bonus1 + bonus2 + bonus3);


        System.out.println(totalBonus);
        System.out.println(initial + totalBonus);


    }
}
