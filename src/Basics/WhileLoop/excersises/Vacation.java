package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cashNeeded = Double.parseDouble(scanner.nextLine());
        double cashSaved = Double.parseDouble(scanner.nextLine());

        int failSave = 0;
        int days = 0;
        boolean lose = false;



        while (cashSaved < cashNeeded){
            String action = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());
            days++;
            if (action.equals("spend")){
                cashSaved -= cash;
                if (cashSaved <0){
                    cashSaved = 0;
                }
                failSave++;
                if (failSave==5){
                    lose = true;
                    break;
                }

            } else if (action.equals("save")){
                cashSaved += cash;
                failSave = 0;
            }

        }

        if (lose){
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else{
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
