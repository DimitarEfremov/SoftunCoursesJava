package Advanced.FunctionalProgramming.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> startWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> wordsQueue = new ArrayDeque<>();

        Arrays.stream(words).filter(startWithUppercase).forEach(wordsQueue::offer);

        System.out.println(wordsQueue.size());

        for (String s : wordsQueue) {
            System.out.println(s);
        }
    }
}
