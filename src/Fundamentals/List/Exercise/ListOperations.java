package Fundamentals.List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            if (command.contains("Add")){

                numbersList.add(Integer.parseInt(command.split(" ")[1]));

            } else if (command.contains("Insert")){
                if (isIndexValid(numbersList, Integer.parseInt(command.split(" ")[2]) )){

                    int number = Integer.parseInt(command.split(" ")[1]);
                    int index = Integer.parseInt(command.split(" ")[2]);

                    numbersList.add(index,number);

                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove ")){
                if (isIndexValid(numbersList,Integer.parseInt(command.split(" ")[1]))){
                    numbersList.remove(Integer.parseInt(command.split(" ")[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")){
                int shifts = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shifts; i++) {
                    int numberToShift = numbersList.get(0);
                    numbersList.add(numberToShift);
                    numbersList.remove(0);
                }
            } else if (command.contains("Shift right")){
                int shifts = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i <shifts ; i++) {
                    int numbersToShift = numbersList.get(numbersList.size()-1);
                    numbersList.add(0,numbersToShift);
                    numbersList.remove(numbersList.size()-1);
                }
            }


            command = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));

    }


    private static boolean isIndexValid (List<Integer> list, int index){
        return (index >= 0 && index <= list.size()-1 );
    }
}
