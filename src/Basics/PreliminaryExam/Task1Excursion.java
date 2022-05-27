package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task1Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nightPrice = Integer.parseInt(scanner.nextLine());
        int cardsForTransport = Integer.parseInt(scanner.nextLine());
        int ticketsForMuseum = Integer.parseInt(scanner.nextLine());


        double expensesSleep = 20 * nightPrice;
        double transportExpense = cardsForTransport * 1.6;
        double museumExpense = ticketsForMuseum * 6;

        double totalExpense = ((expensesSleep + transportExpense + museumExpense)* people) * 1.25;

        System.out.printf("%.2f",totalExpense);

    }
}
