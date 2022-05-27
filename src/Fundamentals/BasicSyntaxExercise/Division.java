package com.company.BasicSyntaxEcercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int division = 0;
        Boolean notDivisable = false;

        if (n % 2 == 0) {
            division = 2;
        } if (n % 3 == 0) {
            division = 3;
        }  if (n % 6 == 0) {
            division = 6;
        }  if (n % 7 == 0) {
            division = 7;
        }  if (n % 10 == 0) {
            division = 10;
        } if (division == 0){
            notDivisable = true;
        }

        if (notDivisable){
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d",division);
        }


    }
}
