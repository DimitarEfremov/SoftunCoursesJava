package Fundamentals.ArraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] command = input.split(" ");

            if (command[0].equals("Loot")) {
                for (int i = 1; i < command.length; i++) {
                    boolean weHaveIt = false;
                    for (int j = 0; j < treasureChest.length; j++) {

                        if (command[i].equals(treasureChest[j])) {
                            weHaveIt = true;
                            break;
                        }
                    }
                    if (!weHaveIt) {
                        String newChest = command[i] + " " + String.join(" ", treasureChest);
                        treasureChest = newChest.split(" ");
                    }
                }
            }
            if (command[0].equals("Drop")) {
                int drop = Integer.parseInt(command[1]);

                if (drop > 0 && drop <= treasureChest.length) {
                    String droppedItem = treasureChest[drop];
                    for (int i = drop; i < treasureChest.length-1; i++) {
                        treasureChest[i] = treasureChest[i + 1];
                    }
                    treasureChest[treasureChest.length - 1] = droppedItem;
                }
            }
            if (command[0].equals("Steal")) {
                int steal = Integer.parseInt(command[1]);

                if (steal > 0 && treasureChest.length > steal) {

                    for (int i = 0; i < steal; i++) {
                        System.out.print(treasureChest[treasureChest.length - steal + i]);
                        if (i != steal - 1) {
                            System.out.print(", ");
                        }
                    }

                    String[] tempChest = new String[treasureChest.length - steal];

                    for (int i = 0; i < tempChest.length; i++) {
                        tempChest[i] = treasureChest[i];
                    }
                    treasureChest = tempChest;
                } else if (steal > 0) {
                    for (int i = 0; i < treasureChest.length; i++) {
                        System.out.print(treasureChest[i]);
                        if (i != treasureChest.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    treasureChest = new String[0];
                }
                System.out.println();
            }

            input = scanner.nextLine();
        }

        double treasureSum = 0;
        double treasureCounter = 0;
        for ( String item: treasureChest) {
        treasureSum += item.length();
        treasureCounter++;
        }

        double averageTreasure = treasureSum/treasureCounter;

        if (treasureChest.length == 0){
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        }

    }
}

