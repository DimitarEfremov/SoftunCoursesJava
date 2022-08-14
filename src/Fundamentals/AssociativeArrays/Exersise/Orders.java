package Fundamentals.AssociativeArrays.Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);


                priceMap.put(product, price);


            if (quantityMap.containsKey(product)) {
                int currentValue = quantityMap.get(product);
                quantityMap.put(product, currentValue + quantity);
            } else {
                quantityMap.put(product, quantity);
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {

            String productName = entry.getKey();
            double finalSum = entry.getValue() * quantityMap.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
