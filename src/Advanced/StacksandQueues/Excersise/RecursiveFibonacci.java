package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> deck = new ArrayDeque<>();

        deck.push(0L);
        deck.push(1L);

        if (n < 2 ){
            System.out.println("1");
        } else {

            for (int i = 0; i <n ; i++) {


                    long numberOne = deck.pop();
                    long numberTwo = deck.pop();
                    deck.push(numberOne);
                    deck.push(numberOne+numberTwo);

            }

            System.out.println(deck.peek());
        }
    }
}
