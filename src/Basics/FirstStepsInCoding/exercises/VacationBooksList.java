package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int TimeNeeded = pages / PagesPerHour;
        int DaysNeeded = TimeNeeded / Days;

        System.out.println(DaysNeeded);


    }
}
