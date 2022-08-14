package Fundamentals.AssociativeArrays.Exersise;

import com.sun.jdi.event.StepEvent;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceUsersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                if (!forceUsersMap.containsKey(forceSide) && !forceUsersMap.containsValue(forceUser)) {
                    List<String> list = new ArrayList<>();
                    list.add(forceUser);
                    forceUsersMap.put(forceSide, list);

                } else if (forceUsersMap.containsKey(forceSide)) {
                    if (!forceUsersMap.get(forceSide).contains(forceUser)) {
                        List<String> list = forceUsersMap.get(forceSide);
                        list.add(forceUser);
                        forceUsersMap.put(forceSide, list);
                    }
                }

            } else if (input.contains("->")) {
                String forceSide = input.split(" -> ")[1];
                String forceUser = input.split(" -> ")[0];

                for (Map.Entry<String, List<String>> entry : forceUsersMap.entrySet()) {
                    entry.getValue().remove(forceUser);
                }

                if (forceUsersMap.containsKey(forceSide)) {
                    List<String> list = forceUsersMap.get(forceSide);
                    list.add(forceUser);
                    forceUsersMap.put(forceSide, list);
                } else {
                    List<String> list1 = new ArrayList<>();
                    list1.add(forceUser);
                    forceUsersMap.put(forceSide, list1);

                }
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : forceUsersMap.entrySet()) {
            if (entry.getValue().size() != 0){
            System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
            for (String memeber : entry.getValue() ) {
                System.out.printf("! %s%n", memeber);
            }
            }
        }

    }
}
