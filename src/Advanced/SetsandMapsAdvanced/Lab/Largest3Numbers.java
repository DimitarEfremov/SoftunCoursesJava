package Advanced.SetsandMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> sortedList = integerList.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());


        if (sortedList.size() >= 3){
            for (int i = 0; i <3 ; i++) {
                System.out.print(sortedList.get(i) + " ");
            }
        } else {
            for (Integer integer : sortedList) {
                System.out.print(integer + " ");
            }
        }

    }
}
