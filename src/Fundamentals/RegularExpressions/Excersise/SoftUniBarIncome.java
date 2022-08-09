package Fundamentals.RegularExpressions.Excersise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;

        String input = scanner.nextLine();

        Pattern validOrderPattern = Pattern.compile
                ("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[A-Za-z]+.)>[^|$%.]*\\|(?<qt>\\d+)[^|$%.]*\\|[^|$%.]*?(?<pr>[0-9]+\\.*[0-9]*)\\$");

        while (!input.equals("end of shift")){
            Matcher matcher = validOrderPattern.matcher(input);
            while (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int qt = Integer.parseInt(matcher.group("qt"));
                double pr = Double.parseDouble(matcher.group("pr"));
                totalPrice += qt*pr;

                System.out.printf("%s: %s - %.2f%n",name,product,qt*pr);
            }



            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}

