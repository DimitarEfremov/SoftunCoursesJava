package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> characterMap = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i <input.length() ; i++) {

            char symbol = input.charAt(i);

            characterMap.putIfAbsent(symbol,0);

            characterMap.put(symbol,characterMap.get(symbol)+1);

        }

        for (Character character : characterMap.keySet()) {
            System.out.printf("%c: %d time/s%n",character,characterMap.get(character));
        }
    }
}
