package Advanced.MultidimensionalArrays.Excersise;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double healthHeigan = 3000000;
        int healthPlaier = 18500;

        int damagePerTurnToBoss = Integer.parseInt(scanner.nextLine());

        String[][] battleField = new String[15][15];
        for (String[] strings : battleField) {
            for (String string : strings) {
                string = "notDamaged";
            }
        }

        String input = scanner.nextLine();

        while (healthHeigan >0 || healthPlaier >0){
            String spell = input.split(" ")[0];
            int attackedRow = Integer.parseInt(input.split(" ")[1]);
            int attackedCol = Integer.parseInt(input.split(" ")[2]);

            String playerPosition = battleField[7][7];



        }
    }
}
