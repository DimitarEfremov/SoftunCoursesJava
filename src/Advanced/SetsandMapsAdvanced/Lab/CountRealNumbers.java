package Advanced.SetsandMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] dataSet = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        LinkedHashMap<Double, Integer> map  = new LinkedHashMap<>();


        for (double numbs : dataSet) {

            map.putIfAbsent(numbs, 0);

            map.put(numbs,map.get(numbs)+1);

        }

        for (Double aDouble : map.keySet()) {
            System.out.printf("%.1f -> %d%n",aDouble, map.get(aDouble));
        }

    }
}
