package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String TVshow = scanner.nextLine();
        int TVtime = Integer.parseInt(scanner.nextLine());
        int BreakTime = Integer.parseInt(scanner.nextLine());

        double LunchTime = BreakTime / 8.00;
        double RestTime = BreakTime / 4.00;
        double SpareTime = BreakTime - (LunchTime + RestTime);

        if (SpareTime >= TVtime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", TVshow, Math.ceil(SpareTime - TVtime));
        } else  {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", TVshow, Math.ceil(TVtime - SpareTime));
        }


    }
}
