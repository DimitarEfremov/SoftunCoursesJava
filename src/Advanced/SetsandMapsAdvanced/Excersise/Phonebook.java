package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputPhone = scanner.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        while (!inputPhone.equals("search")){
            String name = inputPhone.split("-")[0];
            String phone = inputPhone.split("-")[1];

            phoneBook.put(name,phone);

            inputPhone = scanner.nextLine();
        }

        String input = scanner.nextLine();

        while (!input.equals("stop")){

            if (phoneBook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n",input);
            }

            input = scanner.nextLine();
        }


    }
}
