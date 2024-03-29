package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateforNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxLength = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> nameCheck = name -> name.length() <= maxLength;

        names.stream().filter(nameCheck).forEach(System.out::println) ;

    }
}
