package Basics.NestedLoops.lab;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        double totalScore = 0;
        int scoresAmount = 0;



        while (!input.equals("Finish")){

            double averageScore = 0;

            for (int i = 1; i <=jury ; i++) {
                double score = Double.parseDouble(scanner.nextLine());

                totalScore += score;
                scoresAmount++;

                averageScore += score;
            }
            System.out.printf("%s - %.2f.%n",input,averageScore / jury);



            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalScore/scoresAmount);

    }
}
