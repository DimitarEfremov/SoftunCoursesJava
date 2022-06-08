package Fundamentals.ArraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String input = scanner.nextLine();

        while (!input.equals("Yohoho")){
            String[] command = input.split(" ");

            if (command[0].equals("Loot")){
                for (int i = 1; i <command.length ; i++) {
                    boolean weHaveIt = false;
                    for (int j = 0; j < treasureChest.length; j++) {

                        if (command[i].equals(treasureChest[j])){
                            weHaveIt = true;
                            break;
                        }
                        }
                    if (!weHaveIt){
                        String newChest = command[i] + " " + String.join(" ", treasureChest);
                        treasureChest = newChest.split(" ");
                    }
                }
            }
            if (command[0].equals("Drop")){
                int drop = Integer.parseInt(command[1]);
                    String droppedItem = treasureChest[drop];
                    for (int i = drop; i < treasureChest.length; i++) {
                        treasureChest[drop] = treasureChest[drop+1];
                    }
                    treasureChest[treasureChest.length-1] = droppedItem;
                }
            if (command[0].equals("Drop")){
                int steal = Integer.parseInt(command[1]);
                for (int i = 0; i < ; i++) {
                    
                }
            }



            input = scanner.nextLine();
            }
        }
    }

