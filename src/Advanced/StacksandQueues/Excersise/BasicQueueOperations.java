package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] conditions = scanner.nextLine().split("\\s+");

        int numbersToAdd = Integer.parseInt(conditions[0]);
        int numbersToPop = Integer.parseInt(conditions[1]);
        int numbersToSearch = Integer.parseInt(conditions[2]);

        String[] numbArray = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numbersToAdd; i++) {
            queue.offer(Integer.parseInt(numbArray[i]));
        }

        for (int i = 0; i <numbersToPop ; i++) {
            queue.poll();
        }

        if (queue.contains(numbersToSearch)){
            System.out.println("true");
        } else if (queue.isEmpty()){
            System.out.println("0");
        }  else {
            int minElement = Collections.min(queue);
            System.out.println(minElement);
        }
    }
}
