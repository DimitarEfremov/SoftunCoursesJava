package Fundamentals.DataTypesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=numb ; i++) {
            int usableNumb = i;

            int sum = 0;

            while (usableNumb != 0){


                sum += usableNumb%10;

                usableNumb /= 10;

            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf( "%d -> True%n",i);
            } else {
                System.out.printf( "%d -> False%n",i);
            }




        }
    }
}
