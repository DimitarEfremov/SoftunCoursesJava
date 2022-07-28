package Fundamentals.AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Double :: parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countNumberMap = new TreeMap<>();

        for ( double currentNum: numberList
             ) {
            if (countNumberMap.containsKey(currentNum)){
                int currentValue = countNumberMap.get(currentNum);
                countNumberMap.put(currentNum, currentValue+1);
            } else {
                countNumberMap.put(currentNum,1);
            }
        }

// for (double currentNum: numberList
//      ) {
//    countNumberMap.putIfAbsent(currentNum, 0);
//    int currentValue = countNumberMap.get(currentNum);
//    countNumberMap.put(currentNum, currentValue+1);
// }

        for (Map.Entry<Double, Integer> entry : countNumberMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(),entry.getValue());
        }


    }
}
