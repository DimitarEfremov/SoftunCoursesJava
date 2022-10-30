package OOP.WorkingwithAbstraction.Excersise.Card;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
//        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());
//        int result = cardRanks.getPower() + cardSuits.getPower();

        String rankToFind = scanner.nextLine();
        String suitToFind = scanner.nextLine();

        int rankPower = Arrays.stream(CardRanks.values()).filter(v -> v.name().equals(rankToFind)).findFirst().get().getPower();
        int cardPower = Arrays.stream(CardSuits.values()).filter(v -> v.name().equals(suitToFind)).findFirst().get().getPower();




        System.out.printf("Card name: %s of %s; Card power: %d",rankToFind,suitToFind,rankPower+cardPower);

    }
}
