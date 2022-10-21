package Advanced.DefiningClasses.Excersises.PokemonTrainer;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<TrainerPT> trainerSet = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("Tournament")){
            String[] parts = input.split("\\s+");
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String pokemonElement = parts[2];
            int pokemonHealth = Integer.parseInt(parts[3]);


            PokemonPT pokemonPT = new PokemonPT(pokemonName,pokemonElement,pokemonHealth);

           if (trainerSet.stream().noneMatch(pt -> pt.getName().equals(trainerName))){
               TrainerPT trainerPT = new TrainerPT(trainerName);
               trainerSet.add(trainerPT);
           }

            for (TrainerPT pt : trainerSet) {
                if (pt.getName().equals(trainerName)){
                    pt.addPokemon(pokemonPT);
                }
            }


            input = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")){

            for (TrainerPT trainerPT : trainerSet) {
                String finalElement = element;
                if (trainerPT.getPokemonList().stream().noneMatch(p -> p.getElement().equals(finalElement))){
                   trainerPT.hurtPokemon();
               } else {
                    trainerPT.setBadges(trainerPT.getBadges()+1);
                }
            }




            element = scanner.nextLine();
        }

        trainerSet.stream().sorted((a,b) -> Integer.compare(b.getBadges(), a.getBadges())).forEach(tr -> {
            System.out.printf("%s %d %d%n", tr.getName(),tr.getBadges(),tr.getPokemonList().size());

        });


    }
}
