package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseandExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int numb = Integer.parseInt(scanner.nextLine());

        Collections.reverse(integerList);

//       integerList.removeIf(n -> n % numb == 0);

        Predicate<Integer> listPredicate = n -> n % numb == 0;

        integerList.removeIf(listPredicate);



        integerList.forEach(n -> System.out.print(n + " "));



    }
}
