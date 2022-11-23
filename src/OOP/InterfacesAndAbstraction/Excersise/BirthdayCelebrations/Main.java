package OOP.InterfacesAndAbstraction.Excersise.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String classType = input.split(" ")[0];

            if (classType.equals("Pet")){
                Pet pet = new Pet(input.split(" ")[1], input.split(" ")[2]);
                birthableList.add(pet);
            } else if (classType.equals("Citizen")){
                String name = input.split(" ")[1];
                int age = Integer.parseInt(input.split(" ")[2]);
                String id = input.split(" ")[3];
                String birthDate =  input.split(" ")[4];

                Citizen citizen = new Citizen( name, age, id, birthDate);

                birthableList.add(citizen);
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        for (Birthable birthable : birthableList) {
            if (birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
            }
        }

    }
}
