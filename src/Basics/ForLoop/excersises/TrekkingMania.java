package Basics.ForLoop.excersises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int monblan = 0;
        int kiliman = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= n; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            if (group < 6) {
                musala += group;
            } else if (group < 13) {
                monblan += group;
            } else if (group < 26) {
                kiliman += group;
            } else if (group < 41) {
                k2 += group;
            } else {
                everest += group;
            }

        }

        double totalPeople = musala + monblan + kiliman + k2 + everest;

        System.out.printf("%.2f%%%n", musala / totalPeople*100);
        System.out.printf("%.2f%%%n", monblan / totalPeople*100);
        System.out.printf("%.2f%%%n", kiliman / totalPeople*100);
        System.out.printf("%.2f%%%n", k2 / totalPeople*100);
        System.out.printf("%.2f%%%n", everest / totalPeople*100);
    }
}
