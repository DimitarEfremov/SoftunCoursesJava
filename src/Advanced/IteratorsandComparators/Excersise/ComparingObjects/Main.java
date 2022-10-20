package Advanced.IteratorsandComparators.Excersise.ComparingObjects;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<PersonCO> people = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("END")){
            String name = input.split("\\s+")[0];
                    int age = Integer.parseInt(input.split("\\s+")[1]);
                            String city = input.split("\\s+")[2];

            PersonCO person = new PersonCO(name,age,city);
            people.add(person);


            input = scanner.nextLine();
        }

        int indexOfPerson = Integer.parseInt(scanner.nextLine());

        int samePeople = 0;
        int differentPeople = 0;

        PersonCO personToCompare  = people.get(indexOfPerson-1);

        for (PersonCO person : people) {
                if (person.compareTo(personToCompare) == 0){
                    samePeople++;
                } else {
                    differentPeople++;
                }
        }


        if (samePeople == 1){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, differentPeople, people.size());
        }

    }
}
