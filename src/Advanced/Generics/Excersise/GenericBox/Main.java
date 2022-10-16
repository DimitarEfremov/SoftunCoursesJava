package Advanced.Generics.Excersise.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BoxGB<Double> box = new BoxGB();

        for (int i = 0; i <n ; i++) {
            double element = Double.parseDouble(scanner.nextLine());
            box.add(element);

      }

        double elementToCompare = Double.parseDouble(scanner.nextLine());

        System.out.println(box.elementsBiggerThan(elementToCompare));

    }
}
