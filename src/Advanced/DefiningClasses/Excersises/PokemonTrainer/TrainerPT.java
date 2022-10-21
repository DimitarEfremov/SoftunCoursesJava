package Advanced.DefiningClasses.Excersises.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class TrainerPT {

    private String name;
    private int badges;
    List<PokemonPT> pokemonList;

    public TrainerPT(String name) {
        this.name = name;
        badges = 0;
        pokemonList = new ArrayList<>();
    }


    public void hurtPokemon(){
        for (PokemonPT pokemon : pokemonList) {
            pokemon.setHealth(pokemon.getHealth() - 10);
            if (pokemon.getHealth()<= 0){
                pokemonList.remove(pokemon);
                return;
            }
        }

    }

    public void addPokemon(PokemonPT pokemonPT){
        this.pokemonList.add(pokemonPT);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<PokemonPT> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<PokemonPT> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
