package com.company.BasicSyntaxEcercise;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = n; i <= end; i++) {
            System.out.print(i + " ");
            sum +=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
