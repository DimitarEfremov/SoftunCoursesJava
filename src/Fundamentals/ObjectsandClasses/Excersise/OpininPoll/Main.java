package Fundamentals.ObjectsandClasses.Excersise.OpininPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String dataInput = scanner.nextLine();
            String name = dataInput.split(" ")[0];
            int age = Integer.parseInt(dataInput.split(" ")[1]);

            if (age > 30){
                Person person = new Person(name,age);
                personList.add(person);
            }
        }
        for (Person person: personList
             ) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
