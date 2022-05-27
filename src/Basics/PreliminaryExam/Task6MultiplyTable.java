package Basics.PreliminaryExam;

import java.util.Scanner;

public class Task6MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int number1 = number % 100;
        number1 = number1 %10;

        int number2 = number % 100;
        number2 = number2 / 10;

        int number3 = number / 100;


        for (int i = 1; i <=number1 ; i++) {
            for (int j = 1; j <=number2 ; j++) {
                for (int k = 1; k <=number3; k++) {

                    int result = i * j* k;

                    System.out.printf("%d * %d * %d = %d;%n",i,j,k, result);
                }
                
            }
            
        }

    }
}
