package Advanced.FunctionalProgramming.Excersises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();



        while (!command.equals("Party!")){
            String[] commandParts = command.split("\\s+");
            String action = commandParts[0];
            String filter = commandParts[1];
            String criteria = commandParts[2];

            Predicate<String> predicate = createPredicate(filter,criteria);

            if (action.equals("Remove")){
                names.removeIf(predicate);
            } else if (action.equals("Double")){
                List<String> namesToBeAdded = new ArrayList<>();
                for (String name : names) {
                    if (predicate.test(name)){
                        namesToBeAdded.add(name);
                    }
                }
                names.addAll(namesToBeAdded);
            }


            command = scanner.nextLine();
        }

        if (names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else{
            names = names.stream().sorted().collect(Collectors.toList());
            String finalGuests =  String.join(", ",names);
            System.out.print(finalGuests + " are going to the party!");
        }


    }

    private static Predicate<String> createPredicate(String filter, String criteria) {

        switch (filter){
            case "StartsWith":
                return s -> s.startsWith(criteria);
            case "EndsWith":
                return s -> s.endsWith(criteria);
            case "Length":
                return s -> s.length() == Integer.parseInt(criteria);

        }
        return null;
    }
}
