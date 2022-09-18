package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String s : input) {
            stack.push(s);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


    }
}
