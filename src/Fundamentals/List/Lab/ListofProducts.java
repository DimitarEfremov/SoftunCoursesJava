package Fundamentals.List.Lab;

import java.util.*;

public class ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            productList.add(scanner.nextLine());
        }

        Collections.sort(productList);

        for (int i = 1; i <=n ; i++) {
            System.out.printf("%d.%s%n",i,productList.get(i-1));
        }

    }
}
