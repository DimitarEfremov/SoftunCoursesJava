package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task5Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nightRest = scanner.nextLine();

        int days=1;
        int totalDistance = 5364;


        boolean success = false;

        while (!nightRest.equals("END")){
            if (nightRest.equals("Yes")){
                days++;
            }

            if (days > 5){
                break;
            }


            int distance = Integer.parseInt(scanner.nextLine());
            totalDistance +=distance;


            if (totalDistance >= 8848){
                success = true;
                break;
            }


            nightRest = scanner.nextLine();
        }


        if (success){
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.printf("%s",totalDistance);
        }
    }
}
