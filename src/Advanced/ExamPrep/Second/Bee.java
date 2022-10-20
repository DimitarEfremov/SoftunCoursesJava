package Advanced.ExamPrep.Second;

import java.util.Scanner;

public class Bee {

    static int rowOfBee;
    static int colOfBee;
    static boolean beeIsLost = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[size][size];

        int pollinatedFlowers = 0;

        for (int i = 0; i < size; i++) {
            String row = scanner.nextLine();
            if (row.contains("B")) {
                rowOfBee = i;
                colOfBee = row.indexOf('B');
            }
            territory[i] = row.toCharArray();
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            territory[rowOfBee][colOfBee] = '.';

            switch (command) {

                case "up":
                    rowOfBee--;
                    if (outOfBounds(command, size)) {
                        break;
                    }
                    if (territory[rowOfBee][colOfBee] == 'O') {
continue;
                    }


                    break;
                case "down":
                    rowOfBee++;
                    if (outOfBounds(command, size)) {
                        break;
                    }
                    if (territory[rowOfBee][colOfBee] == 'O') {
                        continue;
                    }

                    break;
                case "left":
                    colOfBee--;
                    if (outOfBounds(command, size)) {
                        break;
                    }
                    if (territory[rowOfBee][colOfBee] == 'O') {
                        continue;
                    }

                    break;
                case "right":
                    colOfBee++;
                    if (outOfBounds(command, size)) {
                        break;
                    }
                    if (territory[rowOfBee][colOfBee] == 'O') {
                        continue;
                    }

                    break;
            }

            if (beeIsLost) {
                break;
            }

            if (territory[rowOfBee][colOfBee] == 'f') {
                pollinatedFlowers++;
            }

            territory[rowOfBee][colOfBee] = 'B';

            command = scanner.nextLine();
        }

        if (pollinatedFlowers >= 5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n",pollinatedFlowers);
        } else {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        }

        for (char[] row : territory) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


    }

    private static boolean outOfBounds(String command, int size) {

        if (command.equals("up") && rowOfBee < 0) {
            System.out.println("The bee got lost!");
            beeIsLost = true;
            return true;
        } else if (command.equals("down") && rowOfBee >= size) {
            System.out.println("The bee got lost!");
            beeIsLost = true;
            return true;
        } else if (command.equals("left") && colOfBee < 0) {
            System.out.println("The bee got lost!");
            beeIsLost = true;
            return true;
        } else if (command.equals("right") && colOfBee >= size) {
            System.out.println("The bee got lost!");
            beeIsLost = true;
            return true;
        }

        return false;
    }
}
