package Basics.ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double comission = 0;

        switch (city){
            case "Sofia":
                if (sales >= 0 && sales <=500){
                    comission = 0.05;
                } else if (sales > 500 && sales <=1000){
                    comission = 0.07;
                } else if(sales > 1000 && sales <=10000){
                    comission = 0.08;
                } else if(sales > 10000){
                    comission = 0.12;
                }
                break;
        }        switch (city){
            case "Varna":
                if (sales >= 0 && sales <=500){
                    comission = 0.045;
                } else if (sales > 500 && sales <=1000){
                    comission = 0.075;
                } else if(sales > 1000 && sales <=10000){
                    comission = 0.1;
                } else if(sales > 10000){
                    comission = 0.13;
                }
                break;
        }        switch (city){
            case "Plovdiv":
                if (sales >= 0 && sales <=500){
                    comission = 0.055;
                } else if (sales > 500 && sales <=1000){
                    comission = 0.08;
                } else if(sales > 1000 && sales <=10000){
                    comission = 0.12;
                } else if(sales > 10000){
                    comission = 0.145;
                }
                break;

        }
        if (comission == 0){
            System.out.println("error");
        } else System.out.printf("%.2f",comission * sales );

    }
}
