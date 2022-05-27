package Basics.WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int grade = 1;
        double averagescore = 0;
        int fail = 0;

        while (grade <= 12) {
            double score = Double.parseDouble(scanner.next());
            if (score >= 4.00) {
                grade++;
                averagescore += score;
                fail = 0;
            } else {
                fail++;
                if (fail == 2) {
                    System.out.printf("%s has been excluded at %d grade", student,grade);
                    break;
                }
            }


        }

        if (grade >= 13) {
            System.out.printf("%s graduated. Average grade: %.2f", student, averagescore / 12);
        }


    }
}
