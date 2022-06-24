package Fundamentals.ListsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();
        List<String> letters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            boolean isDigit = Character.isDigit(input.charAt(i));

            if (isDigit){
                int toAdd = Integer.parseInt(String.valueOf(input.charAt(i)));
                numbers.add(toAdd);
            } else {
                String toAdd = String.valueOf(input.charAt(i));
                letters.add(toAdd);
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 1; i <=numbers.size() ; i++) {
            if (i%2 != 0){
                takeList.add(numbers.get(i-1));
            } else {
                skipList.add(numbers.get(i-1));
            }
        }

        String result = "";

        for (int i = 0; i < takeList.size(); i++) {
            int numbersToTake = takeList.get(i);

            for (int j = 0; j <numbersToTake ; j++) {
                String element = letters.get(0);
                result += element;
                letters.remove(0);
            }
            int numbersToSkip = skipList.get(i);
            for (int j = 0; j < numbersToSkip ; j++) {
                letters.remove(0);
            }

        }

        System.out.println(takeList);
        System.out.println(skipList);
        System.out.println(result);
    }
}
