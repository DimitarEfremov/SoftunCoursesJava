package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestNumbFunction = list ->{
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i) <= min  ){
                    min = list.get(i);
                    index = i;
                }
            }
            return index;

        };

//        Function<List<Integer>, Integer> smallestNumbFunction2 = list2 -> {
//            int min2 = list2.stream().mapToInt(e -> e).min().getAsInt();
//            return list2.lastIndexOf(min2);
//        };

        int answer = smallestNumbFunction.apply(numbers);

        System.out.println(answer);

    }
}
