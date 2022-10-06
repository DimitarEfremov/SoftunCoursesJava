package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        UnaryOperator<List<Integer>> add = numbers -> numbers.stream().map(n -> n + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply = numbers -> numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = numbers -> numbers.stream().map(n -> n - 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = numbers -> numbers.forEach(n -> System.out.print(n + " "));

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    integerList = add.apply(integerList);
                    //integerList = integerList.stream().map(n -> n + 1).collect(Collectors.toList());
                    break;
                case "multiply":
                    integerList = multiply.apply(integerList);
                    break;
                case "subtract":
                    integerList = subtract.apply(integerList);
                    break;
                case "print":
                    print.accept(integerList);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
