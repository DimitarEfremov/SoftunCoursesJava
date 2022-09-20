package Advanced.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String[] kids = input.split("\\s+");

        ArrayDeque<String> queueKids = new ArrayDeque<>();

        for (String kid : kids) {
            queueKids.offer(kid);
        }

        while (queueKids.size()>1){
            for (int i = 1; i <n ; i++) {
                queueKids.offer(queueKids.poll());
            }

            System.out.println("Removed " + queueKids.poll());
        }

        System.out.println("Last is " + queueKids.poll());

    }
}
