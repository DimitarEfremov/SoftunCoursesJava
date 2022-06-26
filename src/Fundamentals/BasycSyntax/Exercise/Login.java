package com.company.BasicSyntaxEcercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() - 1; i >= 0; i--) {
            char currentSymbol = userName.charAt(i);
            password += currentSymbol;
        }

        String passwordAttempt = scanner.nextLine();

        int counter = 0;

        while (!passwordAttempt.equals(password)) {


            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            passwordAttempt = scanner.nextLine();
        }

        if (counter != 4) {
            System.out.printf("User %s logged in.", userName);
        }


    }
}
