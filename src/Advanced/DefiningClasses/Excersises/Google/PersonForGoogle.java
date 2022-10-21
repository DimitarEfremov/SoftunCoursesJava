package Advanced.DefiningClasses.Excersises.Google;

import java.util.ArrayList;
import java.util.List;

public class PersonForGoogle {
    private String name;
    private String company;
    private List<String> pokemon;
    private List<String> parents;
    private List<String> children;
    private String car;


    public PersonForGoogle(String name) {
        this.name = name;
        pokemon = new ArrayList<>();
        parents = new ArrayList<>();
        children = new ArrayList<>();



    }

    public void addPokemon(String pokemon){
        if (!this.pokemon.contains(pokemon)){
            this.pokemon.add(pokemon);
        }
    }

    public void addParent(String parent){
        if (!this.parents.contains(parent)){
            this.parents.add(parent);
        }
    }

    public void addChild(String kid){
        if (!this.children.contains(kid)){
            this.children.add(kid);
        }
    }

    public void printInfo(){
        System.out.println(name);

        System.out.println("Company:");
        if (company != null){
            System.out.println(company);
        }

        System.out.println("Car:");
        if (car != null){
            System.out.println(car);
        }

        System.out.println("Pokemon:");
        for (String s : pokemon) {
            System.out.println(s);
        }

        System.out.println("Parents:");
        for (String s : parents) {
            System.out.println(s);
        }

        System.out.println("Children:");
        for (String s : children) {
            System.out.println(s);
        }



    }


























    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<String> pokemon) {
        this.pokemon = pokemon;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}
