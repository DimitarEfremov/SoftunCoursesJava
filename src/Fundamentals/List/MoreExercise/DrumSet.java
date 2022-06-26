package Fundamentals.List.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cash = Double.parseDouble(scanner.nextLine());
        List<Integer> drumsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> initialQuality = new ArrayList<>(drumsList);


        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")){
            int damage = Integer.parseInt(input);
            for (int i = 0; i < drumsList.size() ; i++) {
                int drum = drumsList.get(i) - damage;
                drumsList.set(i,drum);
            }

            for (int i = 0; i < drumsList.size() ; i++) {
                if (drumsList.get(i)<=0){
                    int newDrumPrice = initialQuality.get(i) *3;
                    if (cash-newDrumPrice >= 0){
                        int newDrum = initialQuality.get(i);
                        drumsList.set(i,newDrum);
                        cash-=newDrumPrice;
                    } else {
                        drumsList.remove(i);
                        initialQuality.remove(i);
                    }
                }
            }

            input = scanner.nextLine();
        }


        System.out.println(drumsList.toString().replaceAll("[\\[\\],]",""));
        System.out.printf("Gabsy has %.2flv.",cash);
    }
}
