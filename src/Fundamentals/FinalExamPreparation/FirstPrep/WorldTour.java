package Fundamentals.FinalExamPreparation.FirstPrep;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String travelInput = scanner.nextLine();
        StringBuilder toWorkWith = new StringBuilder(travelInput);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            if (input.contains("Add Stop")) {
                int index = Integer.parseInt(input.split(":")[1]);
                String destination = input.split(":")[2];

                if (index >= 0 && index <= toWorkWith.length()-1) {
                    toWorkWith.insert(index, destination);
                }
                System.out.println(toWorkWith);

            } else if (input.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(input.split(":")[1]);
                int endIndex = Integer.parseInt(input.split(":")[2]);

                if (startIndex >= 0 && endIndex <= toWorkWith.length()-1 && startIndex <= endIndex) {
                    toWorkWith.delete(startIndex, endIndex + 1);
                }
                System.out.println(toWorkWith);

            } else if (input.contains("Switch")) {
                String destinationToReplace = input.split(":")[1];
                String destinationToAdd = input.split(":")[2];

                if (toWorkWith.toString().contains(destinationToReplace)) {
                    toWorkWith = new StringBuilder(toWorkWith.toString().replace(destinationToReplace, destinationToAdd));
                }
                System.out.println(toWorkWith);
            }


            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + toWorkWith);

    }
}
