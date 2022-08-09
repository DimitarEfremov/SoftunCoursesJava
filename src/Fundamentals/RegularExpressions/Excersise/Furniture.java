package Fundamentals.RegularExpressions.Excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        List<String> purchases = new ArrayList<>();
        double totalSum = 0;

        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<qnt>\\d+)");


        while (!input.equals("Purchase")){

            Matcher matcher = pattern.matcher(input);


            if (matcher.find()){
                String furniture = matcher.group("furniture");
                purchases.add(furniture);

                double price = Double.parseDouble(matcher.group("price"));
                int quontity = Integer.parseInt(matcher.group("qnt"));
                totalSum += price*quontity;
            }



            input=scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String purchase: purchases) {
            System.out.println(purchase);
        }
        System.out.printf("Total money spend: %.2f",totalSum);
    }
}
