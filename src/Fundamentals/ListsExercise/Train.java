package Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> trainArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Add")){
                int newWagon = Integer.parseInt(command.split(" ")[1]);
                trainArray.add(newWagon);
            } else {
                int newPassangers = Integer.parseInt(command);
                for (int i = 0; i < trainArray.size(); i++) {
                    if (trainArray.get(i)+newPassangers<=maxCapacity){
                        int newCapacity = trainArray.get(i)+newPassangers;
                        trainArray.set(i,newCapacity);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(trainArray.toString().replaceAll("[\\[\\],]",""));
    }
}
