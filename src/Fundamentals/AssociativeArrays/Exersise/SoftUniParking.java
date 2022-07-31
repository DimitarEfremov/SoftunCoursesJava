package Fundamentals.AssociativeArrays.Exersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carRegister = new LinkedHashMap<>();

        for (int i = 0; i <n; i++) {
            String input = scanner.nextLine();

            String command = input.split(" ")[0];
            String user = input.split(" ")[1];


            if (command.equals("register")){
                String licensePlate = input.split(" ")[2];
                if (carRegister.containsKey(user)) {
                    System.out.printf("ERROR: already registered with plate number %s%n",carRegister.get(user));
                } else {
                    carRegister.put(user,licensePlate);
                    System.out.printf("%s registered %s successfully%n",user,licensePlate);
                }
            } else if (command.equals("unregister")){
                if (!carRegister.containsKey(user)){
                    System.out.printf("ERROR: user %s not found%n",user);
                } else {
                    carRegister.remove(user);
                    System.out.printf("%s unregistered successfully%n",user);
                }
            }

        }

        carRegister.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
