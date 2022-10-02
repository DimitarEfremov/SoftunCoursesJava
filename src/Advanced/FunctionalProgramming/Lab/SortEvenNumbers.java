package Advanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


        System.out.println(integerList.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        System.out.println(integerList.stream().sorted().map(String::valueOf).collect(Collectors.joining(", ")));


    }
}
