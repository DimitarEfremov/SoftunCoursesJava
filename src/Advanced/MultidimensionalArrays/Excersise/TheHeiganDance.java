package Advanced.MultidimensionalArrays.Excersise;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double healthHeigan = 3000000;
        int healthPlaier = 18500;

        double damagePerTurnToBoss = Double.parseDouble(scanner.nextLine());


        String input = scanner.nextLine();

        boolean isPoisoned = false;

        int playerRow = 7;
        int playerCol = 7;

        while (healthHeigan >= 0 || healthPlaier >= 0) {
            String spell = input.split(" ")[0];
            int attackedRow = Integer.parseInt(input.split(" ")[1]);
            int attackedCol = Integer.parseInt(input.split(" ")[2]);


            String[][] damageMatrix = new String[15][15];
            fillTheMatrix(damageMatrix);

            if (isPoisoned) {
                healthPlaier -= 3500;
            }
            healthHeigan -= damagePerTurnToBoss;

            damageMatrix = damageToTheMatrix(attackedRow, attackedCol, damageMatrix);

            switch (spell) {
                case "Cloud":

                    isPoisoned = false;

                    if (damageMatrix[playerRow][playerCol].equals("damaged")) {
                        if (damageMatrix[playerRow + 1][playerCol].equals("damaged") && isInBounds(damageMatrix, playerRow + 1, playerCol)) {
                            if (damageMatrix[playerRow][playerCol + 1].equals("damaged") && isInBounds(damageMatrix, playerRow, playerCol + 1)) {
                                if (damageMatrix[playerRow - 1][playerCol].equals("damaged") && isInBounds(damageMatrix, playerRow - 1, playerCol)) {
                                    if (damageMatrix[playerRow][playerCol - 1].equals("damaged") && isInBounds(damageMatrix, playerRow, playerCol - 1)) {
                                        healthPlaier -= 3500;
                                        isPoisoned = true;

                                        if (healthPlaier <= 0) {
                                            plearDied(healthHeigan, spell, playerRow, playerCol);
                                        }
                                    } else {
                                        playerCol = healthPlaier - 1;
                                    }
                                } else {
                                    playerRow = playerRow - 1;
                                }
                            } else {
                                playerCol = playerCol + 1;
                            }
                        } else {
                            playerRow = playerRow + 1;
                        }
                    }


                    break;

                case "Eruption":

                    isPoisoned = false;

                    if (damageMatrix[playerRow][playerCol].equals("damaged")) {
                        if (damageMatrix[playerRow + 1][playerCol].equals("damaged") && isInBounds(damageMatrix, playerRow + 1, playerCol)) {
                            if (damageMatrix[playerRow][playerCol + 1].equals("damaged") && isInBounds(damageMatrix, playerRow, playerCol + 1)) {
                                if (damageMatrix[playerRow - 1][playerCol].equals("damaged") && isInBounds(damageMatrix, playerRow - 1, playerCol)) {
                                    if (damageMatrix[playerRow][playerCol - 1].equals("damaged") && isInBounds(damageMatrix, playerRow, playerCol - 1)) {
                                        healthPlaier -= 6000;

                                        if (healthPlaier <= 0) {
                                            plearDied(healthHeigan, spell, playerRow, playerCol);
                                        }

                                    } else {
                                        playerCol = healthPlaier - 1;
                                    }
                                } else {
                                    playerRow = playerRow - 1;
                                }
                            } else {
                                playerCol = playerCol + 1;
                            }
                        } else {
                            playerRow = playerRow + 1;
                        }
                    }


                    break;


            }


            input = scanner.nextLine();
        }

        if (healthHeigan<=0){
            System.out.println("Heigan: Defeated!");
            System.out.printf("Player: %d",healthPlaier);
            System.out.printf("Final position: %d, %d", playerRow, playerCol);
        }


    }

    private static String[][] fillTheMatrix(String[][] damageMatrix) {
        for (int r = 0; r < 15; r++) {
            for (int c = 0; c < 15; c++) {
                damageMatrix[r][c] = "notDamaged";
            }
        }
        return damageMatrix;
    }

    private static String[][] damageToTheMatrix(int attackedRow, int attackedCol, String[][] damageMatrix) {
        for (int r = attackedRow - 1; r < attackedRow + 2; r++) {
            for (int c = attackedCol - 1; c < attackedCol + 2; c++) {
                if (isInBounds(damageMatrix, r, c)) {
                    damageMatrix[r][c] = "damaged";
                }
            }
        }
        return damageMatrix;
    }

    private static void plearDied(double healthHeigan, String spell, int playerRow, int playerCol) {
        System.out.printf("Heigan: %.2f%n", healthHeigan);
        System.out.printf("Player: Killed by %s%n", spell);
        System.out.printf("Final position: %d, %d", playerRow, playerCol);
    }

    private static void methodToDamageTiles(int attackedRow, int attackedCol, String[][] damageMatrix) {
        for (int r = attackedRow - 1; r < attackedRow + 2; r++) {
            for (int c = attackedCol - 1; c < attackedCol + 2; c++) {
                damageMatrix[r][c] = "damaged";
            }
        }
    }

    private static boolean isInBounds(String[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length;
    }

}
