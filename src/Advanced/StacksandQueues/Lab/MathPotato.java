package Advanced.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String[] kids = input.split("\\s+");

        ArrayDeque<String> queueKids = new ArrayDeque<>();

        for (String kid : kids) {
            queueKids.offer(kid);
        }

        int cycle = 0;


        while (queueKids.size()>1){


            for (int i = 1; i <n ; i++) {

                queueKids.offer(queueKids.poll());
            }

        cycle++;

           boolean prime = isPrime(cycle);


            if (!prime){
                System.out.println("Removed " + queueKids.poll());
            } else {
                System.out.println("Prime " + queueKids.peek());
            }
        }

        System.out.println("Last is " + queueKids.poll());

    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
