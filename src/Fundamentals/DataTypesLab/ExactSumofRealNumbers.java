package Fundamentals.DataTypesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <=numbers ; i++) {

            BigDecimal input = new BigDecimal(scanner.nextLine());

            sum = sum.add(input);


        }

        System.out.println(sum);
    }
}
