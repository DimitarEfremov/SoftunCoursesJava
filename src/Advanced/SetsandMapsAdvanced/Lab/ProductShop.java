package Advanced.SetsandMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, List<String>> shopProductMap = new TreeMap<>();

        while (!input.equals("Revision")){
            String shop = input.split(", ")[0];
            String product = input.split(", +")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            shopProductMap.putIfAbsent(shop,new ArrayList<>());

            String productAndPrice = String.format("Product: %s, Price: %.1f",product,price);


            shopProductMap.get(shop).add(productAndPrice);


            input=scanner.nextLine();
        }

        for (String shopsMap : shopProductMap.keySet()) {
            System.out.println(shopsMap + "->");
            for (String s : shopProductMap.get(shopsMap)) {
                System.out.println(s);
            }
        }

    }
}
