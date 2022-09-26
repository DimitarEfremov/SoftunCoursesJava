package Advanced.SetsandMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guestList = new TreeSet<>();

        String guest = scanner.nextLine();

        while (!guest.equals("PARTY")){
            guestList.add(guest);

            guest = scanner.nextLine();
        }

        guest = scanner.nextLine();

        while (!guest.equals("END")){
            guestList.remove(guest);

            guest = scanner.nextLine();
        }

        System.out.println(guestList.size());

        for (String s : guestList) {
            if (  Character.isDigit(s.charAt(0))){
                System.out.println(s);
            }
        }
        for (String s : guestList) {
            if (  !Character.isDigit(s.charAt(0))){
                System.out.println(s);
            }
        }

    }
}
