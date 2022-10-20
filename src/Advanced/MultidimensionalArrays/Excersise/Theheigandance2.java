package Advanced.MultidimensionalArrays.Excersise;

import java.util.Scanner;

public class Theheigandance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double healthHeigan = 3000000;
        int healthPlaier = 18500;

        int startPlRow = 7;
        int startPlCol = 7;

        String lastSpell = "";
        boolean activeCloud = false;

        double damage = Double.parseDouble(scanner.nextLine());

        while (healthPlaier > 0 && healthHeigan > 0) {
            healthHeigan -= damage;

            if (activeCloud) {
                healthPlaier -= 3500;
                activeCloud = false;

                if (healthPlaier < 0) {
                    break;
                }
            }

            if (healthHeigan < 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            boolean[][] hsChamber = new boolean[15][15];
            for (int i = row - 1; i <= row + 1; i++) {
                if (i >= 0 && i < hsChamber.length) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (j >= 0 && j < hsChamber[row].length) {
                            hsChamber[i][j] = true;
                        }
                    }
                }
            }

            if (hsChamber[startPlRow][startPlCol]) {
                if (isRowValid(hsChamber, startPlRow - 1) && !hsChamber[startPlRow - 1][startPlCol]) {
                    startPlRow--; // move up
                } else if (isColValid(hsChamber, startPlCol + 1) && !hsChamber[startPlRow][startPlCol + 1]) {
                    startPlCol++; // move right
                } else if (isRowValid(hsChamber, startPlRow + 1) && !hsChamber[startPlRow + 1][startPlCol]) {
                    startPlRow++; // move down
                } else if (isColValid(hsChamber, startPlCol - 1) && !hsChamber[startPlRow][startPlCol - 1]) {
                    startPlCol--; // move left
                }

                if (hsChamber[startPlRow][startPlCol]) {
                    switch (spell) {
                        case "Cloud":
                            healthPlaier -= 3500;
                            activeCloud = true;
                            lastSpell = "Plague Cloud";
                            break;
                        case "Eruption":
                            healthPlaier -= 6000;
                            lastSpell = spell;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid spell: " + spell);
                    }
                }
            }
        }

        if (healthHeigan > 0) {
            System.out.printf("Heigan: %.2f%n", healthHeigan);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (healthPlaier > 0) {
            System.out.printf("Player: %d%n", healthPlaier);
        } else {
            System.out.println("Player: Killed by " + lastSpell);
        }

        System.out.println("Final position: " + startPlRow + ", " + startPlCol);
    }

    private static boolean isRowValid(boolean[][] hsChamber, int startPlRow) {
        return startPlRow >= 0 && startPlRow < hsChamber[startPlRow].length;
    }

    private static boolean isColValid(boolean[][] hsChamber, int startPlCol) {
        return startPlCol >= 0 && startPlCol < hsChamber.length;
    }

}
