package Fundamentals.RegularExpressions.Excersise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] runners = scanner.nextLine().split(", ");
        Map<String, Integer> runnersMap = new LinkedHashMap<>();

        for (String runner: runners) {
            runnersMap.put(runner, 0);
        }

        Pattern patternForName = Pattern.compile("[A-Za-z]+");
        Pattern patternForTime = Pattern.compile("[0-9]");

        String input = scanner.nextLine();




        while (!input.equals("end of race")){

            StringBuilder name = new StringBuilder();
            int time = 0;

            Matcher matcherForName = patternForName.matcher(input);
            Matcher matcherForTime = patternForTime.matcher(input);

            while (matcherForName.find()){

                name.append(matcherForName.group());
            }
            while (matcherForTime.find()){
                int newTime = Integer.parseInt(matcherForTime.group());
                time += newTime;
            }

            String nameNew = name.toString();
            if (runnersMap.containsKey(nameNew)){
                int oldTime = runnersMap.get(nameNew);

                runnersMap.put(nameNew,oldTime+time);
            }



            input=scanner.nextLine();
        }

        List<String> nameOfFirstThree = runnersMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //сортирам записите по value (дистанция) в намаляващ ред
                .limit(3) //взима първите 3 записа от мап
                .map(Map.Entry::getKey) //на всеки запис взимам ключ (име на играч)
                //{"George", "Peter", "Bill"}
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n",nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
