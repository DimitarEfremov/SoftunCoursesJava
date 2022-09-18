package Advanced.StacksandQueues.Excersise;

import java.util.Scanner;

public class RecursiveFibonacci2 {
    public static long[] memory;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        memory = new long[n+1];

        long result = fibonacci(n);
        System.out.println(result);

    }

    public static long fibonacci (Integer number){
        if (number <2){
            return 1;
        }

        if (memory[number] != 0){
            return memory[number];
        }
        memory[number] = fibonacci(number-1) + fibonacci(number-2);

        return fibonacci(number-1) + fibonacci( number -2);


    }
}
