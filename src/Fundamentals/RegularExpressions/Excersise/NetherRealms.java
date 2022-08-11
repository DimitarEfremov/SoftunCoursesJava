package Fundamentals.RegularExpressions.Excersise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] names = scanner.nextLine().split(",\s+");



        Pattern patternHealth = Pattern.compile("[^0-9+\\-*/.]");
        Pattern patternDamage = Pattern.compile("-?\\+?[0-9]+\\.?[0-9]*");

        for (int i = 0; i < names.length ; i++) {

            int health = 0;
            double damage = 0;

            Matcher matcherHealth = patternHealth.matcher(names[i]);
            while (matcherHealth.find()){
                String toBeAdded = matcherHealth.group();
                for (char ch: toBeAdded.toCharArray()) {
                    health = health + ch;
                }
            }

            Matcher matcherDamage = patternDamage.matcher(names[i]);
            while (matcherDamage.find()){
                damage +=  Double.parseDouble(matcherDamage.group());
            }

            for (char ch: names[i].toCharArray()) {
                if (ch == '*'){
                    damage *= 2;
                }
                if (ch == '/'){
                    damage -= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n",names[i],health,damage);
        }


    }
}
