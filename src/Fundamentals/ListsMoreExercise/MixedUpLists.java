package Fundamentals.ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Collections.reverse(secondList);

        List<Integer> combinedList = new ArrayList<>();

        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            int firstInt = firstList.get(i);
            int secondInt = secondList.get(i);
            combinedList.add(firstInt);
            combinedList.add(secondInt);
        }

        List<Integer> range = new ArrayList<>();

        if (firstList.size()> secondList.size()){
            range = rangeList(firstList);
        } else {
            range = rangeList(secondList);
        }

        int minRage = Collections.min(range);
        int maxRange = Collections.max(range);

        combinedList.removeIf(n -> (n<=minRage || n>=maxRange) );
        Collections.sort(combinedList);


        System.out.println(combinedList.toString().replaceAll("[\\[\\],]",""));
    }

    private static List<Integer> rangeList (List<Integer> listInt){
        List<Integer> range = new ArrayList<>();
        for (int i = 1; i <=2 ; i++) {
            int integer = listInt.get(listInt.size()-i);
            range.add(integer);
        }
        return range;
    }

}
