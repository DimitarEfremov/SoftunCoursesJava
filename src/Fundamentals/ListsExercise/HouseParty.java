package Fundamentals.ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String comand = scanner.nextLine();
            String guest = comand.split(" ")[0];

            if (comand.contains("is going!")) {
                if (guestList.contains(guest)) {
                    System.out.printf("%s is already in the list!%n", guest);
                } else {
                    guestList.add(guest);
                }
            } else if (comand.contains("is not going!")) {
                if (guestList.contains(guest)) {
                    guestList.remove(guest);
                } else {
                    System.out.printf("%s is not in the list!%n", guest);
                }
            }
        }
        for (String element : guestList) {
            System.out.println(element);
        }
    }
}
