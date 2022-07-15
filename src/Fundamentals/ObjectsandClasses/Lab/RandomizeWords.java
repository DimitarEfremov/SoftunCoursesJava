package Fundamentals.ObjectsandClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());



        Random rnd = new Random();
        while (!input.isEmpty()){
            int randomPosition = rnd.nextInt(input.size());
            String wordToBePrinted = input.get(randomPosition);
            System.out.println(wordToBePrinted);
            input.remove(randomPosition);
        }



    }
}
