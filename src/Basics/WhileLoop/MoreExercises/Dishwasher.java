package Basics.WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int detergentAmount = bottles * 750;

        int detergentUsed = 0;
        int dishesCounter = 0;
        int potsCounter = 0;



        int counter = 0;

        boolean notEnouh = false;

        String input = scanner.nextLine();

        while (!input.equals("End")){
            int dishes = Integer.parseInt(input);
            counter++;
            if (counter % 3 == 0){
                potsCounter += dishes;
                detergentUsed += dishes * 15;
            } else {
                dishesCounter += dishes;
                detergentUsed += dishes * 5;
            }

            if (detergentUsed > detergentAmount){
                notEnouh = true;
                break;
            }



            input = scanner.nextLine();
        }

        if (notEnouh){
            System.out.printf("Not enough detergent, %d ml. more necessary!", detergentUsed - detergentAmount);
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",dishesCounter,potsCounter);
            System.out.printf("Leftover detergent %d ml.",detergentAmount-detergentUsed);
        }
    }
}
