package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double DepositedSum = Double.parseDouble(scanner.nextLine());
        Double  Duration = Double.parseDouble(scanner.nextLine());

        Double YearlyInterestRate = Double.parseDouble(scanner.nextLine());

        Double YearlyInterestpercentage =  YearlyInterestRate /100;
        Double FinalAmount = DepositedSum + (Duration * ((DepositedSum * YearlyInterestpercentage) / 12));

        System.out.println(FinalAmount);
    }

}
