package Advanced.Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stamatLimit = 0;

        int[] milligramsOfCaffeine = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] energyDrinks = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> caffeineSet = new ArrayDeque<>();
        ArrayDeque<Integer> drinkQueue = new ArrayDeque<>();

        for (int i : milligramsOfCaffeine) {
            caffeineSet.push(i);
        }

        for (int drink : energyDrinks) {
            drinkQueue.offer(drink);
        }


        while (!caffeineSet.isEmpty() && !drinkQueue.isEmpty()){

            int caffeine = caffeineSet.peek();
            int drink = drinkQueue.peek();

            int caffeineInTheDrink = caffeine*drink;

            if (caffeineInTheDrink+stamatLimit <= 300){
                caffeineSet.pop();
                drinkQueue.poll();
                stamatLimit += caffeineInTheDrink;
            } else {
                stamatLimit -= 30;
                caffeineSet.pop();
                drinkQueue.offer(drink);
                drinkQueue.poll();

                    if (stamatLimit <0){
                        stamatLimit = 0;
                    }

            }

        }

        if (!drinkQueue.isEmpty()){

            String answer = drinkQueue.stream().map(Object::toString)
                    .collect(Collectors.joining(", "));


            System.out.printf("Drinks left: %s%n", answer);
        } else {

            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.",stamatLimit);


    }
}
