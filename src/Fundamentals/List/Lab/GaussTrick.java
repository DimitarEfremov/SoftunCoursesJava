package Fundamentals.List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int size = inputList.size();

        for (int i = 0; i < size / 2; i++) {
            inputList.set(i,inputList.get(i) + inputList.get(inputList.size() -1) );
            inputList.remove(inputList.size() -1);
        }

            System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));
    }


}
