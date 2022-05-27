package Basics.NestedLoops.lab;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;



        while (!input.equals("stop")){
            int numb = Integer.parseInt(input);

            if (numb < 0 ){

                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean flag = false;

            for (int i = 2; i < numb  ; i++) {
                if (numb % i == 0){
                    nonPrimeSum+= numb;
                    flag = true;
                    break;
                }

            }

            if (!flag){
                primeSum += numb;
            }





            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);

    }
}
