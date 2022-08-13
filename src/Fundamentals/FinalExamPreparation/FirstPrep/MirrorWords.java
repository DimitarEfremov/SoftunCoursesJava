package Fundamentals.FinalExamPreparation.FirstPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@|#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";

        int validPairs = 0;
        List<String> mirrorWords = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            validPairs++;
            StringBuilder firstWord = new StringBuilder(matcher.group("word1"));
            StringBuilder secondWord = new StringBuilder(matcher.group("word2"));

            secondWord.reverse();

            if (firstWord.toString().equals(secondWord.toString())) {
                mirrorWords.add(firstWord.toString() + " <=> " + secondWord.reverse().toString());
            }


        }

        if (validPairs == 0){
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n",validPairs);
        }

        if (mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");

            String delimiter = ", ";

            StringJoiner joiner = new StringJoiner(delimiter);
            mirrorWords.forEach(item -> joiner.add(item));

            System.out.println(joiner.toString());
        }


    }
}
