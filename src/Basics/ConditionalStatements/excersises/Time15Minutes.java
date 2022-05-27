package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        hour = hour * 60;

        int totaltime = hour + minutes + 15;

        int resultHour = totaltime / 60;
        int resultMinute = totaltime % 60;

        if ( resultHour >= 24){
            resultHour = resultHour - 24;
        }

        if (resultMinute <10) {
            System.out.printf("%d:0%d", resultHour, resultMinute );
        } else System.out.printf("%d:%d", resultHour, resultMinute );


    }
}
