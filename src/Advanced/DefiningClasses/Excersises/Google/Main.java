package Advanced.DefiningClasses.Excersises.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        List<PersonForGoogle> persons = new ArrayList<>();


        while (!string.equals("End")) {

            String[] parts = string.split("\\s+");
            String name = parts[0];
            String command = parts[1];

            if (persons.stream().noneMatch(p -> p.getName().equals(name))) {
                PersonForGoogle newP = new PersonForGoogle(name);
                persons.add(newP);

            }

            for (PersonForGoogle person : persons) {
                if (person.getName().equals(name)){
                    createPersonAtributes(parts, person, command);
                }
            }


            string = scanner.nextLine();
        }


        String personToCheck = scanner.nextLine();

        for (PersonForGoogle person : persons) {
            if (person.getName().equals(personToCheck)){
                person.printInfo();
            }
        }

    }

    private static void createPersonAtributes(String[] parts, PersonForGoogle newP, String command) {
        switch (command) {
            case "company":
                String company = parts[2] + " " + parts[3] + " " + parts[4];
                newP.setCompany(company);
                break;
            case "pokemon":
                String pokemon = parts[2] + " " + parts[3];
                newP.addPokemon(pokemon);
                break;
            case "parents":
                String parents = parts[2] + " " + parts[3];
                newP.addParent(parents);
                break;
            case "children":
                String children = parts[2] + " " + parts[3];
                newP.addChild(children);
                break;
            case "car":
                String car = parts[2] + " " + parts[3];
                newP.setCar(car);
                break;

        }
    }
}
