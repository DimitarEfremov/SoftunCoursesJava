package Fundamentals.TextProcessing.Excersise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = "";
        String fileExt = "";

        String[] input = scanner.nextLine().split("\\\\");

        String[] file = input[input.length-1].split("\\.");

        fileName = file[0];
        fileExt = file[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s", fileExt);
    }
}
