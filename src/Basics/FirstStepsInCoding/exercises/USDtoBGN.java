package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD = Double.parseDouble(scanner.nextLine());
       // double BGN = 1.79549;
       // double result = USD * BGN;
        Double result = USD * 1.79549;
        System.out.println(result);
        }

    }

