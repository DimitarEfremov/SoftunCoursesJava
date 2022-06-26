package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeckList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondDeckList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (firstDeckList.size() != 0 && secondDeckList.size() != 0){

            int firstCard = firstDeckList.get(0);
            int secondCard = secondDeckList.get(0);

            if (firstCard > secondCard){

                firstDeckList.remove(0);
                secondDeckList.remove(0);

                firstDeckList.add(firstCard);
                firstDeckList.add(secondCard);
            }  else if (secondCard > firstCard){

                firstDeckList.remove(0);
                secondDeckList.remove(0);

                secondDeckList.add(secondCard);
                secondDeckList.add(firstCard);
            } else {
                firstDeckList.remove(0);
                secondDeckList.remove(0);
            }
        }

        int win = 0;

        if (firstDeckList.size()> secondDeckList.size()) {
            for ( int card: firstDeckList) {
                win += card;
            }
            System.out.printf("First player wins! Sum: %d",win);
        } else {
            for (int card: secondDeckList) {
                win += card;
            }
            System.out.printf("Second player wins! Sum: %d",win);
        }
    }
}
