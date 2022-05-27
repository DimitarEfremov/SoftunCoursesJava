package Basics.FirstStepsInCoding.lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ArchName = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(String.valueOf(3));
        int result = projects * hours;

        System.out.println("The architect " + ArchName + " will need " + result + " hours to complete " + projects +
        " project/s.");
    }
}
