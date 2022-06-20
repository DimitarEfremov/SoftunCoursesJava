package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.contains("Delete")){
                int toBeRemoved = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Collections.singleton(toBeRemoved));
            } else if (command.contains("Insert")){
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(position,element);
            }

            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }
}
