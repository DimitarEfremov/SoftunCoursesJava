package Advanced.FunctionalProgramming.Excersises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    //    int minWithMethod = getMin(numbArray);


        Function<int[], Integer> minWithFunc =  arr -> {
            int min = Integer.MAX_VALUE;

            for (int number : arr) {
                if (number <min){
                    min = number;
                }
            }
            return min;
    };

        int minWithFunction = minWithFunc.apply(numbArray);


        System.out.println(minWithFunction);
     //   System.out.println(minWithMethod);

    }



    public static Integer getMin (int[] numbers){

        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number <min){
                min = number;
            }
        }
            return min;
    }
}
