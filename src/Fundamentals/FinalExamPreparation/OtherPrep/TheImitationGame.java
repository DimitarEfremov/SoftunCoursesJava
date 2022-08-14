package Fundamentals.FinalExamPreparation.OtherPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")){

            if (input.contains("Move")){
                int n = Integer.parseInt(input.split("\\|")[1]);

                message.append(message.substring(0,n));
                message.replace(0,n,"");
            } else if (input.contains("Insert")){
                int n = Integer.parseInt(input.split("\\|")[1]);
                String toBeAdded = input.split("\\|")[2];

                message.insert(n,toBeAdded);
            } else if (input.contains("ChangeAll")){
                String toBeReplaced = input.split("\\|")[1];
                String toBeAdded = input.split("\\|")[2];
                message = new StringBuilder(message.toString().replace(toBeReplaced, toBeAdded));
            }




            input = scanner.nextLine();
        }

        System.out.print("The decrypted message is: ");
        System.out.println(message);
    }
}
