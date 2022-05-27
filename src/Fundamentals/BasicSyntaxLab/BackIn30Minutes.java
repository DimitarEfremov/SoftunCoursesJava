package com.company.BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hh = Integer.parseInt(scanner.nextLine());
        int mm = Integer.parseInt(scanner.nextLine());

        mm = mm + 30;

        if (mm>=60){
            mm-=60;
            hh+=1;
        }
        if (hh>=24){
            hh-=24;
        }

        System.out.printf("%d:%02d",hh,mm);
    }
}
