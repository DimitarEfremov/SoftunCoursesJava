package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elementsSet = new TreeSet<>();


        for (int i = 0; i <n ; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            elementsSet.addAll(Arrays.asList(input));

        }

        String result = String.join(" ", elementsSet);

        System.out.println(result);
    }
}
