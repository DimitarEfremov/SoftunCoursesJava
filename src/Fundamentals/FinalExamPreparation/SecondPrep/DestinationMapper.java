package Fundamentals.FinalExamPreparation.SecondPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String regex = "([=|\\/])(?<country>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinationsList = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()){

            String country = matcher.group("country");

            travelPoints += country.length();
            destinationsList.add(country);

        }



        System.out.print("Destinations: ");


        System.out.println(String.join(", ", destinationsList));

        System.out.printf("Travel Points: %d",travelPoints);
    }
}
