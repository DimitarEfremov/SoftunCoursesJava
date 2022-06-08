package Fundamentals.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for ( int items:numbersArr
             ) {
            if (items % 2 == 0){
                even += items;
            } else {
                odd += items;
            }
            
        }


        System.out.printf("%d",even-odd);
    }
}
