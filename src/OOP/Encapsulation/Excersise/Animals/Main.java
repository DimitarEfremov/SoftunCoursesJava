package OOP.Encapsulation.Excersise.Animals;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String animal = scanner.nextLine();


        while (!animal.equals("Beast!")) {

            String[] animalData = scanner.nextLine().split(" ");
            String name = animalData[0];
            int age = Integer.parseInt(animalData[1]);
            String gender = animalData[2];

            try {

            switch (animal) {
                case "Dog":
                Dog dog = new Dog(name, age, gender);
                System.out.println(dog);
                System.out.println(dog.produceSound());
                break;
                case "Frog":
                Frog frog = new Frog(name, age, gender);
                System.out.println(frog);
                System.out.println(frog.produceSound());
                break;
                case "Cat":
                Cat cat = new Cat(name, age, gender);
                System.out.println(cat);
                System.out.println(cat.produceSound());
                break;
                case "Kitten":
                Kitten kittens = new Kitten(name, age);
                System.out.println(kittens);
                System.out.println(kittens.produceSound());
                break;
                case "Tomcat":
                Tomcat tomcat = new Tomcat(name, age);
                System.out.println(tomcat);
                System.out.println(tomcat.produceSound());
                break;
            }

        } catch (IllegalArgumentException s){
        System.out.println(s.getMessage());
    }

            animal = scanner.nextLine();

        }


    }
}
