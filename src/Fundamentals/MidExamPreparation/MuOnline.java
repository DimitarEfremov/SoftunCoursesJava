package Fundamentals.MidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String[] dungeon = scanner.nextLine().split("\\|");

        int health = 100;
        int bitCoin = 0;
        boolean isDead = false;

        for (int i = 0; i < dungeon.length; i++) {
            String currentRoom = dungeon[i];
            String adventure = currentRoom.split(" ")[0];
            int value = Integer.parseInt(currentRoom.split(" ")[1]);

            switch (adventure) {
                case "potion":
                    int initialHealth = health;
                    health += value;
                    if (health > 100){
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n",health-initialHealth);
                    System.out.printf("Current health: %d hp.%n",health);
                    break;
                case "chest":
                    bitCoin+=value;
                    System.out.printf("You found %d bitcoins.%n",value);
                    break;
                default:
                    health -= value;
                    if (health > 0){
                        System.out.printf("You slayed %s.%n",adventure);
                    } else {
                        System.out.printf("You died! Killed by %s.%n",adventure);
                        System.out.printf("Best room: %d%n",i+1);
                        isDead = true;
                    }
                    break;
            }
            if (isDead) {
                break;
            }

        }

        if (health>0){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitCoin);
            System.out.printf("Health: %d%n", health);
        }
    }
}
