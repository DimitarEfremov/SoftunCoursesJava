package Fundamentals.AssociativeArrays.Exersise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employeeMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String company = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!employeeMap.containsKey(company)){
                employeeMap.put(company,new ArrayList<>());
                employeeMap.get(company).add(employeeId);
            } else if (!employeeMap.get(company).contains(employeeId)){
                employeeMap.get(company).add(employeeId);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
            System.out.printf("%s%n-- %s%n", entry.getKey(), String.join("\n-- ", entry.getValue()));

        }
    }
}
