package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String address = "";

        LinkedHashMap<String, String> emailsMap = new LinkedHashMap<>();

        while (!name.equals("stop")){
            address = scanner.nextLine();

            if(!address.endsWith("us") && !address.endsWith("uk") &&  !address.endsWith("com")){
            emailsMap.put(name,address);
            }





            name = scanner.nextLine();
        }

        for (String nameKey : emailsMap.keySet()) {
            System.out.printf("%s -> %s%n",nameKey,emailsMap.get(nameKey));
        }
    }
}
