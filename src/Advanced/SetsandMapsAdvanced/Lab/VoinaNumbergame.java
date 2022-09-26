package Advanced.SetsandMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> player1set = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> player2set = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));


        for (int i = 0; i <50 ; i++) {


            int card1 = player1set.iterator().next();
            int card2 = player2set.iterator().next();

            player1set.remove(card1);
            player2set.remove(card2);

            if (card1>card2){
                player1set.add(card1);
                player1set.add(card2);
            } else if (card2>card1){
                player2set.add(card1);
                player2set.add(card2);
            }

            if (player1set.isEmpty() || player2set.isEmpty()){
                break;
            }

        }

        if (player1set.size()>player2set.size()){
            System.out.println("First player win!");
        } else if (player2set.size()> player1set.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }

    }
}
