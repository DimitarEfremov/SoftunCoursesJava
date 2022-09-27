package Advanced.SetsandMapsAdvanced.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, List<Double>> studentGradesMap = new TreeMap<>();

        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            Double grade = Double.valueOf(input[1]);

            studentGradesMap.putIfAbsent(name, new ArrayList<>());

          //  List<Double> studentGrades = studentGradesMap.get(name);
          //  studentGrades.add(grade);


            // adding grades to the student in the List.
            studentGradesMap.get(name).add(grade);

        }


        for (String namesFromMap : studentGradesMap.keySet()) {
            System.out.print(namesFromMap + " -> ");
            double total = 0;
            for (Double grade : studentGradesMap.get(namesFromMap)) {
                System.out.print(String.format("%.2f",grade) + " ");
                total+=grade;
            }
            System.out.printf("(avg: %.2f)",total/studentGradesMap.get(namesFromMap).size());
            System.out.println();
        }
    }
}
