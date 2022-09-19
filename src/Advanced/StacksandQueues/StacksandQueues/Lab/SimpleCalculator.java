package Advanced.StacksandQueues.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\s+");

        ArrayDeque<String> itemsStack = new ArrayDeque<>();

        Arrays.stream(items).forEach(n -> itemsStack.add(n));

        while (itemsStack.size() > 1){
            int firstNumber = Integer.parseInt(itemsStack.pop());
            String action = itemsStack.pop();
            int secondNumber = Integer.parseInt(itemsStack.pop());

            switch (action){
                case "+":
                    itemsStack.push(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    itemsStack.push(String.valueOf(firstNumber - secondNumber));
                    break;
            }

        }

        System.out.println(itemsStack.pop());
    }
}
