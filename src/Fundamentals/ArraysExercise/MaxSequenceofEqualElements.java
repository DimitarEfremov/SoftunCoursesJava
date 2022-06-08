package Fundamentals.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int longestRun = 0;

        int startIndex = 0;
        int leftStartInt = 0;

        for (int i = 1; i <array.length; i++) {
            if (array[i] == array[i-1]){
                counter++;
                }
            else {
                counter = 1;
                startIndex = i;
            }
            if (counter > longestRun){
                longestRun = counter;
                leftStartInt = startIndex;
            }

        }
        for (int i = leftStartInt; i <leftStartInt+longestRun ; i++) {
            System.out.print(array[i] + " ");
        }


        }
    }