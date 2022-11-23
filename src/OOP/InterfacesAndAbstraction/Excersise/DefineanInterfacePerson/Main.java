package OOP.InterfacesAndAbstraction.Excersise.DefineanInterfacePerson;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyers = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (input.length == 4) {

                String id = input[2];
                String birthDate = input[3];

                Citizen citizen = new Citizen(name, age, id, birthDate);
                buyers.put(name,citizen);

            } else if (input.length == 3) {

                String group = input[2];
                Rebel rebel = new Rebel(name, age, group);
                buyers.put(name,rebel);
            }


        }


        String individual = scanner.nextLine();

        while (!individual.equals("End")){

            if (buyers.containsKey(individual)){
                buyers.get(individual).buyFood();
            }

            individual = scanner.nextLine();
        }


        int sumOfFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(sumOfFood);
    }


}
