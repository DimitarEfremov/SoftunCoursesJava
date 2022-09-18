package Advanced.StacksandQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        if (decimal == 0){
            System.out.println(decimal);
        }


        ArrayDeque<Integer> binary  = new ArrayDeque<>();

        while (decimal != 0){
            binary.push(decimal%2);

            decimal = decimal/2;
        }

        for (Integer integer : binary) {
            System.out.print(integer);
        }


    }
}
