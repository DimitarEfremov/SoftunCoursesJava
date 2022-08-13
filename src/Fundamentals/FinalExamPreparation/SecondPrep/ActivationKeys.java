package Fundamentals.FinalExamPreparation.SecondPrep;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();
        StringBuilder activationKey = new StringBuilder(rawActivationKey);

        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            if (command.contains("Contains")){
                String substring = command.split(">>>")[1];
                if (rawActivationKey.contains(substring)){
                    System.out.printf("%s contains %s.%n",rawActivationKey,substring);
                } else {
                    System.out.println("Substring not found!");
                }
            }
            if (command.contains("Flip")){
                String caseUL = command.split(">>>")[1];
                int startIndex =  Integer.parseInt(command.split(">>>")[2]);
                int endIndex =  Integer.parseInt(command.split(">>>")[3]);

                if (caseUL.equals("Upper")){
                    String newString = activationKey.substring(startIndex,endIndex).toUpperCase();
                    activationKey.replace(startIndex,endIndex,newString);
                } else if (caseUL.equals("Lower")){
                    String newString = activationKey.substring(startIndex,endIndex).toLowerCase();
                    activationKey.replace(startIndex,endIndex,newString);
                }
                System.out.println(activationKey);
            }
            if (command.contains("Slice")){
                int startIndex =  Integer.parseInt(command.split(">>>")[1]);
                int endIndex =  Integer.parseInt(command.split(">>>")[2]);
                activationKey.replace(startIndex,endIndex,"");
                System.out.println(activationKey);
            }



        command = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",activationKey);

     }
}
