package Advanced.ExamPrep.First;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tasksArray = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] threadsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int valueToBeKilled = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stackOfTasks = new ArrayDeque<>();

        for (int e : tasksArray) {
            stackOfTasks.push(e);
        }

        ArrayDeque<Integer> queueOfThreads = new ArrayDeque<>();

        for (int e : threadsArray) {
            queueOfThreads.offer(e);
        }

        int task = stackOfTasks.peek();
        int thread = queueOfThreads.peek();

        while (task != valueToBeKilled){

            if (thread >= task){
                stackOfTasks.pop();
                queueOfThreads.poll();
            } else {
                queueOfThreads.poll();
            }

            task = stackOfTasks.peek();
            thread = queueOfThreads.peek();
        }

                System.out.printf("Thread with value %d killed task %d%n",thread,task);

         String leftovers = queueOfThreads.stream()
                 .map(String::valueOf)
                 .collect(Collectors.joining(" "));

         System.out.println(leftovers);


    }
}
