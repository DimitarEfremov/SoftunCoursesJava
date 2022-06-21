package Fundamentals.ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandsArray = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            if (commandsArray.get(0).equals("Add")) {
                inputList.add(Integer.parseInt(commandsArray.get(1)));
            }
            else if (commandsArray.get(0).equals("Remove")){
                inputList.remove(Integer.valueOf(commandsArray.get(1)));
            }
            else if (commandsArray.get(0).equals("RemoveAt")){
                inputList.remove(Integer.parseInt(commandsArray.get(1)));
            }
            else if (commandsArray.get(0).equals("Insert")){
                inputList.add(Integer.parseInt(commandsArray.get(2)),Integer.parseInt(commandsArray.get(1)));
            }

            command = scanner.nextLine();
        }

        System.out.println(inputList.toString().replaceAll("[\\[\\],]",""));

    }
}
