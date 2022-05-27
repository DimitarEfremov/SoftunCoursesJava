package Basics.ForLoop.excersises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 200) {
                p1++;
            } else if (input < 400) {
                p2++;
            } else if (input < 600) {
                p3++;
            } else if (input < 800) {
                p4++;
            } else if (input < 9000) {
                p5++;
            }
        }

        double percentagep1 = p1 / n;
        double percentagep2 = p2 / n;
        double percentagep3 = p3 / n;
        double percentagep4 = p4 / n;
        double percentagep5 = p5 / n;

        System.out.printf("%.2f%%%n", percentagep1 * 100);
        System.out.printf("%.2f%%%n", percentagep2 * 100);
        System.out.printf("%.2f%%%n", percentagep3 * 100);
        System.out.printf("%.2f%%%n", percentagep4 * 100);
        System.out.printf("%.2f%%%n", percentagep5 * 100);
    }
}
