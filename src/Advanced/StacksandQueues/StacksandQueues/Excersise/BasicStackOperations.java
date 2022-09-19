package Advanced.StacksandQueues.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] conditions = scanner.nextLine().split("\\s+");

        int numbersToAdd = Integer.parseInt(conditions[0]);
        int numbersToPop = Integer.parseInt(conditions[1]);
        int numbersToSearch = Integer.parseInt(conditions[2]);

        String[] numbArray = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numbersToAdd; i++) {
            stack.push(Integer.parseInt(numbArray[i]));
        }

        for (int i = 0; i <numbersToPop ; i++) {
            stack.pop();
        }

        if (stack.contains(numbersToSearch)){
            System.out.println("true");
        } else if (stack.isEmpty()){
            System.out.println("0");
        }  else {
            int minElement = Collections.min(stack);
            System.out.println(minElement);
        }

    }
}
