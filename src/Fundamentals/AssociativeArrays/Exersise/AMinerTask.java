package Fundamentals.AssociativeArrays.Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        int quantity = 0;


        while (!resource.equals("stop")) {
            quantity = Integer.parseInt(scanner.nextLine());

            if (resourceMap.containsKey(resource)) {
                int currentValue = resourceMap.get(resource);
                resourceMap.put(resource, currentValue + quantity);
            } else {
                resourceMap.put(resource, quantity);
            }


            resource = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }


    }
}
