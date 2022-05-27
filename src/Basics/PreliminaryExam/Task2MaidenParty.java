package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task2MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maidenPartyPrice = Double.parseDouble(scanner.nextLine());
        int countMessages = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countKeychains = Integer.parseInt(scanner.nextLine());
        int countCaricatures = Integer.parseInt(scanner.nextLine());
        int countLuckyCharms = Integer.parseInt(scanner.nextLine());


        double income1 = countMessages * 0.6;
        double income2 = countRoses * 7.2;
        double income3 = countKeychains * 3.6;
        double income4 = countCaricatures * 18.2;
        double income5 = countLuckyCharms * 22.0;

        double totalIncme = income1 + income2 + income3 + income4 + income5;
        int allItems = countCaricatures + countKeychains + countRoses + countMessages + countLuckyCharms;

        if (allItems > 25 ){
            totalIncme *= 0.65;
        }

        totalIncme *=0.9;

        if (totalIncme >= maidenPartyPrice ){
            System.out.printf("Yes! %.2f lv left.", totalIncme - maidenPartyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", maidenPartyPrice - totalIncme);
        }






    }
}
