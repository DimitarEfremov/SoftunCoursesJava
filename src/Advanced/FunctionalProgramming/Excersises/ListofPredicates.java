package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListofPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endOfRange = scanner.nextInt();
        scanner.nextLine();

        List<Integer> numbersToCheck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> isDivisible = numb ->{
            for (Integer toCheck : numbersToCheck) {
                if (numb % toCheck != 0){
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <=endOfRange ; i++) {
            if (isDivisible.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
