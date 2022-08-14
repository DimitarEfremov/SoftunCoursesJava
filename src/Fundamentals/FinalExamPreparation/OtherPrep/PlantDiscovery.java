package Fundamentals.FinalExamPreparation.OtherPrep;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> rarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            rarityMap.put(plant, rarity);
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String subCommand = command.split(":")[1];

            if (command.contains("Rate")) {
                String plant = subCommand.split(" - ")[0].trim();
                double rating = Double.parseDouble(subCommand.split(" - ")[1]);
                if (rarityMap.containsKey(plant)) {
                    List<Double> list = ratingMap.get(plant);
                    list.add(rating);
                    ratingMap.put(plant, list);
                } else {
                    System.out.println("error");
                }
            }
            if (command.contains("Update")) {
                String plant = subCommand.split(" - ")[0].trim();
                int rarity = Integer.parseInt(subCommand.split(" - ")[1]);
                if (rarityMap.containsKey(plant)) {
                    rarityMap.put(plant, rarity);
                } else {
                    System.out.println("error");
                }
                if (command.contains("Update")) {
                    plant = command.split(":")[1].trim();
                    if (ratingMap.containsKey(plant)) {
                        ratingMap.put(plant, new ArrayList<>());
                    } else {
                        System.out.println("error");
                    }
                }


                command = scanner.nextLine();
            }
        }

            System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : rarityMap.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double rating = 0;
            for (Double rate: ratingMap.get(plant)
                 ) {
                rarity += rate;
            }
            rating = rating/ratingMap.get(plant).size();

            System.out.printf("- %s; Rarity: %d; Rating: %.2fn",plant,rarity,rating);
        }

    }
}