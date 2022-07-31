package Fundamentals.AssociativeArrays.Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        resourceMap.put("shards", 0);
        resourceMap.put("fragments", 0);
        resourceMap.put("motes", 0);

        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean weapon = false;


        while (resourceMap.get("shards") < 250 || resourceMap.get("fragments") < 250 || resourceMap.get("motes") < 250) {
            String[] loot = input.split(" ");

            for (int i = 0; i < loot.length; i += 2) {
                int quantity = Integer.parseInt(loot[i]);
                String material = loot[i + 1].toLowerCase();


                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    if (resourceMap.containsKey(material)) {
                        int currentValue = resourceMap.get(material);
                        resourceMap.put(material, currentValue + quantity);
                    } else {
                        resourceMap.put(material, quantity);
                    }
                } else {
                    if (junkMap.containsKey(material)) {
                        int currentValue = junkMap.get(material);
                        junkMap.put(material, currentValue + quantity);
                    } else {
                        junkMap.put(material, quantity);
                    }
                }
                if (resourceMap.get("shards") >= 250 || resourceMap.get("fragments") >= 250 || resourceMap.get("motes") >= 250) {
                    weapon = true;
                    break;
                }
            }
            if (weapon){
                break;
            }
            input = scanner.nextLine();
        }

        if (resourceMap.get("shards") >= 250){
            System.out.println("Shadowmourne obtained!");
            int currentValue = resourceMap.get("shards");
            resourceMap.put("shards", currentValue - 250);
        } else  if (resourceMap.get("fragments") >= 250){
            System.out.println("Valanyr obtained!");
            int currentValue = resourceMap.get("fragments");
            resourceMap.put("fragments", currentValue - 250);
        } else  if (resourceMap.get("motes") >= 250){
            System.out.println("Dragonwrath obtained!");
            int currentValue = resourceMap.get("motes");
            resourceMap.put("motes", currentValue - 250);
        }


        resourceMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
        junkMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));

    }
}
