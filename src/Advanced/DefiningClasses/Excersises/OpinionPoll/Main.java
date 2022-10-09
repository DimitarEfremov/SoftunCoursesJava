package Advanced.DefiningClasses.Excersises.OpinionPoll;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Set<PersonPoll> personPollSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            PersonPoll personPoll = new PersonPoll(name,age);
            personPollSet.add(personPoll);
        }

        personPollSet.stream()
                .filter(p -> p.getAge() > 30)
                .sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(p -> System.out.println(p.getNameAgeInfo()));
    }
}
