package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double spare = change * 100;
        double coins = 0;



        while (spare != 0){
            if (spare >= 200){
                coins += Math.floor(spare /200);
                spare = spare % 200;
            } else if (spare >= 100){
                coins += Math.floor(spare /100);
                spare = spare % 100;
            } else if (spare >= 50){
                coins += Math.floor(spare /50);
                spare = spare % 50;
            } else if (spare >=20){
                coins += Math.floor(spare /20);
                spare = spare % 20;
            } else if (spare >=10){
                coins += Math.floor(spare /10);
                spare = spare % 10;
            } else if (spare >=5){
                coins += Math.floor(spare /5);
                spare = spare % 5;
            } else if (spare >=2){
                coins += Math.floor(spare /2);
                spare = spare % 2;
            } else if (spare >=1){
                coins = coins+1;
                spare = spare % 1;
            } else {
                break;
            }

        }

        System.out.printf("%.0f",coins);




    }
}
