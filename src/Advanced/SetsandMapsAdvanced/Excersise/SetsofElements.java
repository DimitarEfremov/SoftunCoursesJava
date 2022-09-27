package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int set1Size = scanner.nextInt();
        int set2Size = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i <set1Size ; i++) {
            firstSet.add(Integer.valueOf(scanner.nextLine()));
        }

        for (int i = 0; i <set2Size ; i++) {
            secondSet.add(Integer.valueOf(scanner.nextLine()));
        }

        Set<Integer> repeatingElements = new LinkedHashSet<>();

        for (Integer integer : firstSet) {
            if (!secondSet.add(integer)){
                repeatingElements.add(integer);
            }
        }

        // запазва само стойностите които се съдържат и във втория сет
        //firstSet.retainAll(secondSet);

        for (Integer element : repeatingElements) {
            System.out.print(element + " ");
        }


    }
}
