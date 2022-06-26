package com.company.BasicSyntaxEcercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        lightsabersPrice = Math.ceil(studentCount * 1.1) *lightsabersPrice;
        robesPrice = studentCount * robesPrice;
        beltsPrice = (studentCount - (studentCount / 6)) * beltsPrice;
        double totalPrice = lightsabersPrice + robesPrice + beltsPrice;


        if (budget>=totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice-budget);
        }

    }
}
