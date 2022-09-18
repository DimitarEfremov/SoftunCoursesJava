package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i <n ; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("1")){
                deque.push(Integer.parseInt(command[1]));
            } else if (command[0].equals("2")){
                deque.pop();
            } else if (command[0].equals("3")){
                System.out.println(Collections.max(deque));
            }


        }
    }
}
