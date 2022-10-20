package Advanced.IteratorsandComparators.Excersise.StrategyPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<PersonSP> nameSet = new TreeSet<>(new PersonNameComparator());
        TreeSet<PersonSP> ageSet = new TreeSet<>(new PersonAgeComperator());

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            PersonSP person = new PersonSP(input[0],Integer.parseInt(input[1]));

            nameSet.add(person);
            ageSet.add(person);
        }

        for (PersonSP sp : nameSet) {
            System.out.println(sp.getName() + " " + sp.getAge());
        }

        for (PersonSP sp : ageSet) {
            System.out.println(sp.getName() + " " + sp.getAge());
        }
    }
}
