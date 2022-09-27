package Advanced.SetsandMapsAdvanced.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, double[]> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            studentGrades.putIfAbsent(name,grades);

        }

        for (String student : studentGrades.keySet()) {
            System.out.printf("%s is graduated with %s%n", student, findAverageUsingStream(studentGrades.get(student)));
        }
    }

    public static String findAverageUsingStream(double[] array) {
       // return Arrays.stream(array).average().orElse(Double.NaN);

        double sum = 0;
        for (double v : array) {
            sum += v;
        }

        DecimalFormat format = new DecimalFormat("0.################################################");
        return   format.format( sum/array.length);
    }
}
