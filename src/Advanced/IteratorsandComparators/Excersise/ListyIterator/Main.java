package Advanced.IteratorsandComparators.Excersise.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] create = scanner.nextLine().split("\\s+");

        ListyIterator listyIterator = null;

        if (create.length >1){
            String[] toADd = Arrays.copyOfRange(create,1,create.length);

             listyIterator = new ListyIterator(toADd);
        } else {
             listyIterator = new ListyIterator();
        }


        String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] parts = input.split("\\s+");
            String command = parts[0];

            switch (command){

                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    };
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;


            }

            input = scanner.nextLine();
        }



    }
}
