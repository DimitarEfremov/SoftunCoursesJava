package Basics.ConditionalStatements.excersises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PlayerA = Integer.parseInt(scanner.nextLine());
        int PlayerB = Integer.parseInt(scanner.nextLine());
        int PlayerC = Integer.parseInt(scanner.nextLine());

        int TotalTime = PlayerA + PlayerB + PlayerC;

        int Minutes = TotalTime / 60;
        int Seconds = TotalTime % 60;

        if (Seconds <10) {
            System.out.printf("%d:0%d", Minutes, Seconds );
        } else System.out.printf("%d:%d", Minutes, Seconds );


    }
}
