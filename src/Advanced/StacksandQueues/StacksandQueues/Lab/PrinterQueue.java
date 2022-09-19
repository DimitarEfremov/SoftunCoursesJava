package Advanced.StacksandQueues.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> documentQueue = new ArrayDeque<>();


        while (!input.equals("print")){

            if (input.equals("cancel")){
                if (documentQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", documentQueue.poll());
                }
            } else {
                documentQueue.offer(input);
            }

            input = scanner.nextLine();
        }

        for (String element: documentQueue
             ) {
            System.out.println(element);

        }
    }
}
