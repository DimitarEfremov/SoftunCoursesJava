package Fundamentals.RegularExpressions.Excersise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> toBeAttacked = new ArrayList<>();
        List<String> toBeDestroyed = new ArrayList<>();

        String regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:\\d+[^@\\-!:>]*!(?<atc>[AD])![^@\\-!:>]*->\\d+";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int key = 0;

            String tobeUsed = input.toLowerCase();

            for (char ch: tobeUsed.toCharArray()) {
                if (ch == 's' || ch == 't' || ch == 'a'|| ch == 'r'){
                    key++;
                }
            }

            StringBuilder secretMessage = new StringBuilder();

            for (char ch: input.toCharArray()) {
                ch = (char) (ch - key);
                secretMessage.append(ch);
            }

            String message = secretMessage.toString();

            Matcher matcher = pattern.matcher(message);

            String planet = "";
            String action = "";

            if (matcher.find()){
                 planet = matcher.group("planet");
                 action = matcher.group("atc");
            } else {
                continue;
            }


            if (action.equals("A")){
                toBeAttacked.add(planet);
            } else {
                toBeDestroyed.add(planet);
            }


        }

        Collections.sort(toBeAttacked);
        Collections.sort(toBeDestroyed);

        System.out.printf("Attacked planets: %d%n", toBeAttacked.size() );
        for (String planet: toBeAttacked
             ) {
            System.out.printf("-> %s%n", planet);
        }
        System.out.printf("Destroyed planets: %d%n", toBeDestroyed.size() );
        for (String planet: toBeDestroyed
        ) {
            System.out.printf("-> %s%n", planet);
        }
    }
}
