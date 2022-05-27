package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute  = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        int diff = Math.abs(arrivalTime - examTime);
        int diffHour = diff / 60;
        int diffMin = diff % 60;

        if ((arrivalTime - examTime) > 0) {
            System.out.println("Late");
            if ((arrivalTime - examTime) < 60){
                System.out.printf("%d minutes after the start",diff);
            } else {
                System.out.printf("%d:%02d hours after the start",diffHour, diffMin );
            }
        } else if ((arrivalTime <= examTime) && (diff) <= 30)  {
            System.out.println("On time");
            if((arrivalTime - examTime) != 0  && (diff < 60)){
                System.out.printf("%d minutes before the start", diffMin);
            } else if (diff >= 60){
                System.out.printf("%d:%02d hours before the start",diffHour, diffMin);
            }

        } else  {
            System.out.println("early");
            if((arrivalTime - examTime) != 0  && (diff < 60)){
                System.out.printf("%d minutes before the start", diffMin);
            } else if (diff >= 60){
                System.out.printf("%d:%02d hours before the start",diffHour, diffMin);
            }
        }
    }
}
