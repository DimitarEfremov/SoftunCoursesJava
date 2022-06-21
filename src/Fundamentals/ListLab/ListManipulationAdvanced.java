package Fundamentals.ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandsArray = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (commandsArray.get(0)) {
                case "Contains":
                    boolean numberIsFound = false;
                    if (inputList.contains(Integer.parseInt(commandsArray.get(1)))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    if (commandsArray.get(1).equals("even")) {
                        for (Integer element : inputList) {
                            if (element % 2 == 0 && element != 0) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray.get(1).equals("odd")) {
                        for (Integer element : inputList) {
                            if (element % 2 != 0) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int summ = 0;
                    for (Integer element : inputList) {
                        summ += element;
                    }
                    System.out.println(summ);
                    break;

                case "Filter":
                    if (commandsArray.get(1).equals("<")) {
                        for (Integer element : inputList) {
                            if (element < Integer.parseInt(commandsArray.get(2))) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray.get(1).equals(">'")) {
                        for (Integer element : inputList) {
                            if (element > Integer.parseInt(commandsArray.get(2))) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray.get(1).equals(">=")) {
                        for (Integer element : inputList) {
                            if (element >= Integer.parseInt(commandsArray.get(2))) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandsArray.get(1).equals("<=")) {
                        for (Integer element : inputList) {
                            if (element <= Integer.parseInt(commandsArray.get(2))) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            command = scanner.nextLine();
        }

    }
}