package Fundamentals.ObjectsandClasses.Excersise.OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String personalData = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!personalData.equals("End")){
            String name = personalData.split(" ")[0];
            int id = Integer.parseInt(personalData.split(" ")[1]);
            int age = Integer.parseInt(personalData.split(" ")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);


            personalData = scanner.nextLine();
        }

        personList.sort(Comparator.comparingInt(Person::getAge));

        for (Person person: personList
             ) {
            System.out.printf("%s with ID: %d is %d years old.%n",person.getName(),person.getIdNumber(),person.getAge());
        }
    }
}
