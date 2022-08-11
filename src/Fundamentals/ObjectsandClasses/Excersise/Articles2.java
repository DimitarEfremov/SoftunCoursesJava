package Fundamentals.ObjectsandClasses.Excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> articles = new ArrayList<>();


        for (int i = 0; i <n ; i++) {
            String[] topics = scanner.nextLine().split(", ");
            String formated = String.format("%s - %s: %s", topics[0], topics[1], topics[2]);
            articles.add(formated);

        }

        for (String ar: articles
             ) {
            System.out.println(ar);
        }

    }
}
