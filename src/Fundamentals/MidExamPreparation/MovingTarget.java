package Fundamentals.MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String action = command.split(" ")[0];
            int index = Integer.parseInt(command.split(" ")[1]);
            int value = Integer.parseInt(command.split(" ")[2]);

            switch (action){
                case "Shoot":
                    if (index >= 0 && index <= targetsList.size()-1){
                        int damagedTarget = targetsList.get(index) - value;
                        if (damagedTarget <= 0){
                            targetsList.remove(index);
                        } else {
                            targetsList.set(index,damagedTarget);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index <= targetsList.size()-1){
                        targetsList.add(index,value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index - value >=0 && index + value <= targetsList.size()-1){
                        for (int i = 0; i < value *2 + 1 ; i++) {
                            targetsList.remove(index-value);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        List<String> stringList = new ArrayList<>(targetsList.size());
        for (Integer integer : targetsList) {
            stringList.add(String.valueOf(integer));
        }
        System.out.println(String.join("|", stringList));

    }
}
