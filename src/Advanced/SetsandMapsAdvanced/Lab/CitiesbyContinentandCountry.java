package Advanced.SetsandMapsAdvanced.Lab;

import java.util.*;

public class CitiesbyContinentandCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String continent = input[0];
            String country = input[1];
            String city = input[2];


            continentsMap.putIfAbsent(continent, new LinkedHashMap<>());

            Map<String, List<String>> countriesMap = continentsMap.get(continent);

            countriesMap.putIfAbsent(country, new ArrayList<>());

            List<String> cityList = countriesMap.get(country);

            cityList.add(city);

        }

        continentsMap.entrySet().stream()
                .forEach(entry ->{
                    System.out.println(entry.getKey() + ":");
                    entry.getValue().entrySet().stream()
                            .forEach(innerEntry ->{
                            System.out.printf("%s -> %s%n",innerEntry.getKey(),String.join(", ",innerEntry.getValue() ) );
                            });
                });
    }
}
