package Advanced.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();


        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    forward.push(history.pop());
                    System.out.println(history.peek());
                }

            }
            else if (input.equals("forward")) {
                if (forward.isEmpty()){
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forward.peek());
                    history.push(forward.pop());
                }
            }
            else {
                history.push(input);
                forward.clear();
                System.out.println(history.peek());
            }

            input = scanner.nextLine();
        }
    }
}
