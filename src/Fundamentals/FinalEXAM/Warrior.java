package Fundamentals.FinalEXAM;

import java.util.Locale;
import java.util.Scanner;

public class Warrior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder skill = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("For Azeroth")){

            if (command.contains("GladiatorStance")){
                skill = new StringBuilder(skill.toString().toUpperCase());
                System.out.println(skill);
            } else if (command.contains("DefensiveStance")){
                skill = new StringBuilder(skill.toString().toLowerCase());
                System.out.println(skill);
            } else if (command.contains("Dispel")){
                int index = Integer.parseInt(command.split(" ")[1]);
                String letter = (command.split(" ")[2]);

                if (index >=0 && index <skill.length()){
                   skill = skill.replace(index,index+1,letter);
                   System.out.println("Success!");
                } else {
                    System.out.println("Dispel too weak.");
                }

            }

            else if (command.contains("Target Change")){
                String firstss = (command.split(" ")[2]);
                String secondss = (command.split(" ")[3]);
               skill= new StringBuilder(skill.toString().replace(firstss,secondss));

               System.out.println(skill);
            }

            else if (command.contains("Target Remove")){
                String toBeRemoved = (command.split(" ")[2]);
                if (skill.toString().contains(toBeRemoved)){
                    skill = new StringBuilder(skill.toString().replace(toBeRemoved,""));
                    System.out.println(skill);
                }
            } else{
                System.out.println("Command doesn't exist!");
            }








            command = scanner.nextLine();
        }

    }
}
