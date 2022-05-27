package Basics.FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Yard = Double.parseDouble(scanner.nextLine());
        Double totalPrice = Yard * 7.61;
        Double discount = totalPrice * 0.18;
        Double finalPrice = totalPrice - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
