package Fundamentals.FinalExamPreparation.SecondPrep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            if (command.contains("Contains")){
                String substring = command.split(">>>")[0];
                if (activationKey.toString().contains(substring)){
                    System.out.printf("%s contains %s.%n",activationKey,substring);
                } else {
                    System.out.println("Substring not found!");
                }
            }
            if (command.contains("Flip")){
                String substring = command.split(">>>")[0];
                int startIndex = 
            }



        command = scanner.nextLine();
        }

     }
}
