package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> namesSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n; i++) {
            namesSet.add(scanner.nextLine());
        }

        for (String name : namesSet) {
            System.out.println(name);
        }
    }
}
