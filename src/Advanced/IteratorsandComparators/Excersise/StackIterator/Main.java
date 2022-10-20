package Advanced.IteratorsandComparators.Excersise.StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackCustom custom = new StackCustom();
        boolean isEmpty = false;

        String line = scanner.nextLine();

        while (!line.equals("END")){
            String[] parts = line.split("\\s+");
            String command = parts[0];



            switch (command){
                case "Push":

                    String[] numbers = line.split(", ");
                    int firstNumb = Integer.parseInt(numbers[0].split(" ")[1]);

                    custom.push(firstNumb);

                    for (int i = 1; i <numbers  .length ; i++) {
                        custom.push(Integer.parseInt(numbers[i].trim()));
                    }

                    break;
                case "Pop":
                    if (custom.size() == 0){
                        System.out.println("No elements");
                        isEmpty = true;
                        break;
                    } else {
                        custom.pop();
                    }
                    break;

            }
            line = scanner.nextLine();
        }

        if (!isEmpty){
            for (Integer i : custom) {
                System.out.println(i);
            }
            for (Integer i : custom) {
                System.out.println(i);
            }
        }



    }
}
