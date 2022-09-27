package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, HashSet<String>> playersDecks = new LinkedHashMap<>();


        while (!input.equals("JOKER")){
            String name = input.split(": ")[0];

            String[] cards = input.split(": ")[1].split(", ");

            // може да се използва и .trim за да се премахне празното място

            playersDecks.putIfAbsent(name, new HashSet<>());

            playersDecks.get(name).addAll(List.of(cards));


            input = scanner.nextLine();
        }

        for (String nameFromMap : playersDecks.keySet()) {
            int points = calculatePoints(playersDecks.get(nameFromMap));
            System.out.printf("%s: %d%n",nameFromMap,points);
        }

    }

    private static int calculatePoints(HashSet<String> cards) {
            int points = 0;

        for (String card : cards) {
                String power = card.substring(0, card.length()-1);
                String colour = card.substring(card.length()-1);

                points += getValue(power, colour);
        }



        return points;
    }

    private static int getValue(String power, String colour) {

        int cardStrength = 0;
        int multiplayer = 0;

        switch (power){

            case "J":
                cardStrength = 11;
                break;
            case "Q":
                cardStrength = 12;
                break;
            case "K":
                cardStrength = 13;
                break;
            case "A":
                cardStrength = 14;
                break;
            default:
                cardStrength = Integer.parseInt(power);
        }

        switch (colour){
            case "S":
                multiplayer = 4;
                break;
            case "H":
                multiplayer = 3;
                break;
            case "D":
                multiplayer = 2;
                break;
            case "C":
                multiplayer = 1;
                break;
        }

        return cardStrength*multiplayer;


    }
}
