package Advanced.FunctionalProgramming.Excersises;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String[] names = scanner.nextLine().split("\\s+");
//
//        Arrays.stream(names).forEach(System.out::println);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<String> print = System.out::println;

//        for (String s : names) {
//            print.accept(s);
//        }

        names.forEach(print);

    }
}
