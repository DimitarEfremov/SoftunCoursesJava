package Basics.FirstStepsInCoding.lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
                //printirane
        //Hello name
        String result = "Hello, "+ name + "!";
        System.out.println(result);
    }
}
