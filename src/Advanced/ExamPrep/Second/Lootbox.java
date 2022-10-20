package Advanced.ExamPrep.Second;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputForFirstBox = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] inputForSecondBox = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> firstBoxQueue = new ArrayDeque<Integer>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<Integer>();
        int lootValue = 0;

        for (int i : inputForFirstBox) {
            firstBoxQueue.offer(i);
        }

        for (int i : inputForSecondBox) {
            secondBoxStack.push(i);
        }

        int firstLoot = firstBoxQueue.peek();
        int secondLoot = secondBoxStack.peek();


        while (!firstBoxQueue.isEmpty() && !secondBoxStack.isEmpty()){

            int toWorkWith = firstLoot+secondLoot;

            if (toWorkWith % 2 == 0 ){
                lootValue += toWorkWith;
                firstBoxQueue.poll();
                secondBoxStack.pop();
            } else {
                firstBoxQueue.offer(secondBoxStack.pop());
            }

            if (firstBoxQueue.isEmpty()){
                System.out.println("First lootbox is empty");
                break;
            } else if (secondBoxStack.isEmpty()){
                System.out.println("Second lootbox is empty");
                break;
            }



             firstLoot = firstBoxQueue.peek();
             secondLoot = secondBoxStack.peek();
        }

        if (lootValue >= 100){
            System.out.printf("Your loot was epic! Value: %d",lootValue);
        } else {
            System.out.printf("Your loot was poor... Value: %d",lootValue);
        }



    }
}
