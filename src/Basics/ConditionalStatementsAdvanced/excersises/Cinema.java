package Basics.ConditionalStatementsAdvanced.excersises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double amoount = 0;

        switch (type) {
            case "Premiere":
                amoount = r * c * 12;
                break;
            case "Normal":
                amoount = r * c * 7.5;
                break;
            case "Discount":
                amoount = r * c * 5;
                break;
        }

        System.out.printf("%.2f %nleva", amoount);


    }
}
