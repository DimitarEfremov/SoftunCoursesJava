package Advanced.FunctionalProgramming.Excersises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Set<String> filters = new HashSet<>();


        String nextLine = scanner.nextLine();

        while (!nextLine.equals("Print")){
            String[] commandParts = nextLine.split(";");
            String command = commandParts[0];
            String filterType = commandParts[1];
            String parameter = commandParts[2];

            if (command.equals("Add filter")){
                filters.add(filterType + ";" + parameter);
            }else {
                filters.remove(filterType + ";" + parameter);
            }




            nextLine = scanner.nextLine();
        }


        filters.forEach(filter -> {
            Predicate<String> filterToApply = getPredicate(filter);
            names.removeIf(filterToApply);
        });

        names.forEach(n -> System.out.print(n + " "));

    }

    private static Predicate<String> getPredicate(String filter) {
        String[] commandParts = filter.split(";");
        String filterType = commandParts[0];
        String parameter = commandParts[1];

        switch (filterType){
            case "Starts with":
                return s -> s.startsWith(parameter);

            case "Ends with":
                return s -> s.endsWith(parameter);

            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);

            case "Contains":
                return s -> s.contains(parameter);


        }
        return null;

    }
}
