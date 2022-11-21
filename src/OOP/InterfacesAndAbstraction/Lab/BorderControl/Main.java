package OOP.InterfacesAndAbstraction.Lab.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiableList = new ArrayList<>();

        while (!input.equals("End")){
            String[] dataSet = input.split(" ");

            Identifiable identifiable = null;

            if (dataSet.length == 2){
                String model = dataSet[0];
                String id = dataSet[1];
                identifiable = new Robot(id,model);


            } else if (dataSet.length == 3){
                String name = dataSet[0];
                int age = Integer.parseInt(dataSet[1]);
                String id = dataSet[2];

                identifiable = new Citizen(name,age,id);
            }

            identifiableList.add(identifiable);



            input=scanner.nextLine();
        }

        String fakeID = scanner.nextLine();

        for (Identifiable checked : identifiableList) {
            String CheckedID = checked.getId();
            if (CheckedID.endsWith(fakeID)){
                System.out.println(CheckedID);
            }
        }


    }
}
