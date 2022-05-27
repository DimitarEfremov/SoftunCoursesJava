package Basics.NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        int ticketsStudent = 0;
        int ticketsStandard = 0;
        int ticketsKid = 0;
        int ticketsTotal = 0;


        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int seatsTaken = 0;


            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {
                ticketsTotal++;
                seatsTaken++;

                switch (ticket) {
                    case "student":
                        ticketsStudent++;
                        break;
                    case "standard":
                        ticketsStandard++;
                        break;
                    case "kid":
                        ticketsKid++;
                        break;
                }
                if (seatsTaken == freeSeats) {
                    break;
                }


                ticket = scanner.nextLine();
            }

            double capacity = seatsTaken * 100.00 / freeSeats;

            System.out.printf("%s - %.2f%% full.%n", movie, capacity);


            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", ticketsTotal);
        System.out.printf("%.2f%% student tickets.%n", ticketsStudent * 100.00 / ticketsTotal);
        System.out.printf("%.2f%% standard tickets.%n", ticketsStandard * 100.00 / ticketsTotal);
        System.out.printf("%.2f%% kids tickets.", ticketsKid * 100.00 / ticketsTotal);

    }
}
