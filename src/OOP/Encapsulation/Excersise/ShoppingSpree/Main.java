package OOP.Encapsulation.Excersise.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        String[] peopleInput = scanner.nextLine().split(";");
        fillPeopleList(people, peopleInput);

        String[] productInput = scanner.nextLine().split(";");
        fillProductList(productList, productInput);


        String input = scanner.nextLine();

        while (!input.equals("END")){
            String name = input.split("\\s+")[0];
            Person person =  people.stream().filter(p -> p.getName().equals(name)).findFirst().get();
            String productName = input.split("\\s+")[1];
            Product product = productList.stream().filter(p -> p.getName().equals(productName)).findFirst().get();

            try {
                person.buyProduct(product);
                System.out.printf("%s bought %s%n",name,productName);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            input= scanner.nextLine();
        }

        for (Person person : people) {
            System.out.println(person);
        }




    }

    private static void fillProductList(List<Product> productList, String[] productInput) {
        for (int i = 0; i < productInput.length; i++) {
            String name = productInput[i].split("=")[0];
            double cost = Double.parseDouble(productInput[i].split("=")[1]);
            try {
                Product product = new Product(name,cost);
                productList.add(product);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }
    }

    private static void fillPeopleList(List<Person> people, String[] peopleInput) {
        for (int i = 0; i < peopleInput.length; i++) {
            String name = peopleInput[i].split("=")[0];
            double money = Double.parseDouble(peopleInput[i].split("=")[1]);
            try {
                Person person = new Person(name,money);
                people.add(person);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}
