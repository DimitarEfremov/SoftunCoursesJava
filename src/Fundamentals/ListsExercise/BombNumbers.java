package Fundamentals.ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bomb = bombList.get(0);
        int bombRange = bombList.get(1);

        for (int i = 0; i <integerList.size() ; i++) {
            if (integerList.get(i) == bomb){

                int left = Math.max(0, integerList.indexOf(bomb) - bombRange);
                int right = Math.min(integerList.size() -1, integerList.indexOf(bomb) + bombRange);

                for (int j = right; j >= left; j--) {
                    integerList.remove(j);

                }
            }
        }

        int sum = 0;
        for (int number: integerList) {
            sum += number;
        }
            System.out.println(sum);
    }
}
