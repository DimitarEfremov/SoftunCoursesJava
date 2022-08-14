package Fundamentals.BasycSyntax.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice  = Double.parseDouble(scanner.nextLine());
        double mousePrice  = Double.parseDouble(scanner.nextLine());
        double keyboardPrice  = Double.parseDouble(scanner.nextLine());
        double displayPrice  = Double.parseDouble(scanner.nextLine());

        int brokenHeadset = gamesLost/2;
        int brokenMouse = gamesLost/3;
        int brokenKeyboard = gamesLost/6;
        int brokenDisplay = brokenKeyboard/2;

        double totalPrice = brokenHeadset*headsetPrice+brokenMouse*mousePrice+brokenKeyboard*keyboardPrice+displayPrice*brokenDisplay;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);






    }
}
