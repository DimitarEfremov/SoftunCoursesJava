package Advanced.IteratorsandComparators.Excersise.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);

        Lake lake = new Lake(numbers);

        List<String> result = new ArrayList<>();

        for (Integer i : lake) {
            result.add(i.toString());
        }

        System.out.println(String.join(", ", result));


    }
}
