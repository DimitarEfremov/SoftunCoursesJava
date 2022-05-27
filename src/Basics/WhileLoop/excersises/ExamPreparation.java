package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badScoresLimit = Integer.parseInt(scanner.nextLine());
        String input = "";

        int badScores = 0;
        String lastProblem = "";
        double score = 0;
        int scoresAmount = 0;


        while (badScores < badScoresLimit) {

            input = scanner.nextLine();

            if (input.equals("Enough")) {
                break;
            }


            lastProblem = input;

            int newScore = Integer.parseInt(scanner.nextLine());

            score += newScore;
            scoresAmount++;

            if (newScore <= 4) {
                badScores++;
            }


        }

        double averageScore = score / scoresAmount;

        if (badScores >= badScoresLimit) {
            System.out.printf("You need a break, %d poor grades.", badScores);
        } else {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.println("Number of problems: " + scoresAmount);
            System.out.println("Last problem: " + lastProblem);
        }


    }
}
