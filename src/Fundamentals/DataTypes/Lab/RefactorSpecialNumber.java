package Fundamentals.DataTypes.Lab;

import java.util.Scanner;

public class RefactorSpecialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());



        boolean magic = false;

        for (int i = 1; i <= numbers; i++) {

            int usabeleNumb = i;
            int sum = 0;

            while (usabeleNumb > 0) {

                sum += usabeleNumb % 10;
                usabeleNumb = usabeleNumb / 10;
            }

            magic = (sum == 5) || (sum == 7) || (sum == 11);

            String result = String.format("%b",magic);

            System.out.printf("%d -> %s%n", i,result.substring(0, 1).toUpperCase() + result.substring(1));




        }
    }
}
