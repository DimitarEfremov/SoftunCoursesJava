package Fundamentals.FinalExamPreparation.OtherPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([#|\\|])(?<itemName>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<calories>10000|[0-9]?[0-9]?[0-9]?[0-9])\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;

        List<String> itemsData = new ArrayList<>();


        while (matcher.find()){

            String foodItem = matcher.group("itemName");
            String expDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories+= calories;

            String item = String.format("Item: %s, Best before: %s, Nutrition: %d",foodItem,expDate,calories);
            itemsData.add(item);

        }

        System.out.printf("You have food to last you for: %d days!%n",totalCalories/2000);


        for (String entry: itemsData
             ) {
            System.out.println(entry);
        }


        }


    }

