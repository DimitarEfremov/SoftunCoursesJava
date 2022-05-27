package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsTarget = 10000;

        int totalSteps = 0;



        while (totalSteps < stepsTarget){
            String input = scanner.nextLine();
            if (input.equals("Going home")){
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps += steps;
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps += steps;
        }

        if (totalSteps < stepsTarget){
            System.out.printf("%d more steps to reach goal.",stepsTarget - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",totalSteps - stepsTarget);
        }

    }
}
