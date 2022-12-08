package OOP.ExceptionsandErrorHandling.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rangeStart = range[0];
        int rangeEnd = range[1];

        System.out.printf("Range: [%d...%d]%n",rangeStart,rangeEnd);

        boolean isValidInput = false;

        while (!isValidInput){

            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                if(isInRange(number, rangeStart, rangeEnd)){
                    System.out.println("Valid number: " + number);
                    isValidInput = true;
                    break;
                }

            } catch (NumberFormatException ignored){

            }

            System.out.println("Invalid number: " + input);


        }


    }

    private static boolean isInRange(int number, int rangeStart, int rangeEnd) {

        return number >= rangeStart && number <= rangeEnd;
    }
}
