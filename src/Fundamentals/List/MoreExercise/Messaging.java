package Fundamentals.List.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String key = scanner.nextLine();

        String message = "";

        for (int number:listOfNumbers) {
            int index = 0;
            while (number>0){
                index += number%10;
                number = number/10;
            }

            if (index >key.length()-1){
                while (index>key.length()-1){
                    index-=key.length();
                }
            }

            message += key.charAt(index);

            String firstHalf = key.substring(0,index);
            String secondHalf = key.substring(index + 1);
            key = firstHalf + secondHalf;


            }
        System.out.println(message);

        }
    }
