package Fundamentals.FinalExamPreparation.FirstPrep;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];


            List<String> toBeAddedToMap = new ArrayList<>();
            toBeAddedToMap.add(composer);
            toBeAddedToMap.add(key);
            piecesMap.put(piece, toBeAddedToMap);

        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            if (input.contains("Add")) {
                String piece = input.split("\\|")[1];
                String composer = input.split("\\|")[2];
                String key = input.split("\\|")[3];
                if (piecesMap.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    List<String> toBeAddedToMap = new ArrayList<>();
                    toBeAddedToMap.add(composer);
                    toBeAddedToMap.add(key);
                    piecesMap.put(piece, toBeAddedToMap);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }

            }
            if (input.contains("Remove")) {
                String piece = input.split("\\|")[1];
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            if (input.contains("ChangeKey")) {
                String piece = input.split("\\|")[1];
                String newKey = input.split("\\|")[2];
                if (piecesMap.containsKey(piece)) {
                    List<String> updatedList = new ArrayList<>();
                    updatedList.add(piecesMap.get(piece).get(0));
                    updatedList.add(newKey);
                    piecesMap.put(piece, updatedList);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : piecesMap.entrySet()) {

            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
