package Fundamentals.ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("3:1")){
            String action = commandLine.split(" ")[0];

            if (action.equals("merge")){
                int startIndex = Integer.parseInt(commandLine.split(" ")[1]);
                int endIndex = Integer.parseInt(commandLine.split(" ")[2]);

                startIndex = Math.max(startIndex, 0);
                endIndex = Math.min(endIndex, stringList.size()-1);

                if (endIndex>startIndex && startIndex < stringList.size() -1 ){
                    String merged = "";

                    for (int i = startIndex; i <=endIndex ; i++) {
                        merged += stringList.get(i);
                    }
                    stringList.subList(startIndex, endIndex + 1).clear();

                    stringList.add(startIndex,merged);
                }
            }

            if (action.equals("divide")){
                int index = Integer.parseInt(commandLine.split(" ")[1]);
                int partitions = Integer.parseInt(commandLine.split(" ")[2]);

                List<String> splitString = new ArrayList<>();

                int partSize = stringList.get(index).length() / partitions;
                String part = stringList.get(index);
                int start = 0;
                for (int i = 0; i <partitions - 1 ; i++) {

                    splitString.add(part.substring(start, start + partSize));
                    start +=partSize;
                }
                splitString.add(part.substring(start));

                stringList.remove(index);

                stringList.addAll(index,splitString);

            }





            commandLine = scanner.nextLine();
        }

        System.out.println(stringList.toString().replaceAll("[\\[\\],]", ""));
    }
}
