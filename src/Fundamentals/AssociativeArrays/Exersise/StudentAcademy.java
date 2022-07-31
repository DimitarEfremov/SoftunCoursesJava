package Fundamentals.AssociativeArrays.Exersise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> averageGradeMap = new LinkedHashMap<>();

        for (int i = 0; i <n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!averageGradeMap.containsKey(name)){
                averageGradeMap.put(name , new ArrayList<>());
                averageGradeMap.get(name).add(grade);
            } else {
                averageGradeMap.get(name).add(grade);
            }


        }


        for (Map.Entry<String, List<Double>> entry : averageGradeMap.entrySet()) {
            if (getAverageGrade(entry.getValue()) >= 4.5){
                System.out.printf("%s -> %.2f%n",entry.getKey(),getAverageGrade(entry.getValue()));
            }
        }


        //averageGradeMap.forEach((key, value) -> System.out.printf("%s -> %.2f%n",key,getAverageGrade(value)));
    }

    private static double getAverageGrade (List<Double> grades){

        double sum = 0;
        for (double grade: grades
             ) {
            sum+= grade;
        }
        return sum/grades.size();
    }
}
