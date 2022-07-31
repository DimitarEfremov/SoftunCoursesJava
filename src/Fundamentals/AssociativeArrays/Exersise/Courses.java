package Fundamentals.AssociativeArrays.Exersise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseMap = new LinkedHashMap<>();

        while (!input.equals("end")){
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (courseMap.containsKey(course)) {
                courseMap.get(course).add(student);
            } else {
                courseMap.put(course,new ArrayList<>());
                courseMap.get(course).add(student);
            }



            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n-- %s%n", entry.getKey(), entry.getValue().size(), String.join("\n-- ", entry.getValue()));

        }
    }
}
