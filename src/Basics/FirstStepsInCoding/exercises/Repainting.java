package Basics.FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double nailon = Double.parseDouble(scanner.nextLine());
        Double paint = Double.parseDouble(scanner.nextLine());
        Double razreditel = Double.parseDouble(scanner.nextLine());
        Double hours = Double.parseDouble(scanner.nextLine());

        Double nailonFinal = nailon + 2;
        Double paintFinal = paint + ( paint * 0.1 );

        Double consumativi = ((nailonFinal*1.5) + (paintFinal*14.5) + (razreditel * 5) + 0.4 );
        Double result =  consumativi + (hours*(consumativi*0.3));

        System.out.println(result);
    }
}
