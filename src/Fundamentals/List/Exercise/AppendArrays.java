package Fundamentals.List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> revertedList = new ArrayList<>();

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(stringList.size() - 1 -i    );
            revertedList.add(element);
        }

        // Collections.reverse(stringList);


        System.out.println(revertedList.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " ").trim());



    }
}
