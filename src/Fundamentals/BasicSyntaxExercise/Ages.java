package com.company.BasicSyntaxEcercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());

        String ageGroup = "";

        if (age >= 0 && age <= 2){
            ageGroup = "baby";
        } else if (age >= 3 && age <= 13){
            ageGroup = "child";
        } else if (age >= 14 && age <= 19){
            ageGroup = "teenager";
        } else if (age >= 20 && age <= 65){
            ageGroup = "adult";
        } else if (age >= 66) {
            ageGroup = "elder";
        }

        System.out.println(ageGroup);
    }
}
