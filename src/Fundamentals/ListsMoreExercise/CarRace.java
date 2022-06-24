package Fundamentals.ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCarRace = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> secondCarRace = new ArrayList<>();

        for (int i = 0; i < firstCarRace.size() ; i++) {
            int numb = firstCarRace.get(firstCarRace.size() - 1 - i);
            secondCarRace.add(numb);
        }

        double firstCarFinalTime = raceTime(firstCarRace);
        double secondCarFinalTime = raceTime(secondCarRace);

        if (firstCarFinalTime < secondCarFinalTime){
            System.out.printf("The winner is left with total time: %.1f",firstCarFinalTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f",secondCarFinalTime);
        }

    }

    private static double raceTime (List<Integer> list){
        double result = 0;
        for (int i = 0; i < (list.size()/2) ; i++) {
            double element = list.get(i);

            if (element == 0){
                result = result*0.8;
            }
            result += element;
        }


        return result;
    }
}
