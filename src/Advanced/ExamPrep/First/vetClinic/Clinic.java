package Advanced.ExamPrep.First.vetClinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clinic {

    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (data.size() < capacity){
            data.add(pet);
        }
    }

    public boolean remove (String name){

        return data.removeIf(pet -> pet.getName().equals(name));

    }

    public Pet getPet (String name, String owner){

        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }

        return null;
    }

    public Pet getOldestPet(){

      return Collections.max(data,Comparator.comparingInt(Pet::getAge));

    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics(){

        StringBuilder result = new StringBuilder();
        result.append("The clinic has the following patients:");

        for (Pet pet : data) {
            result.append(System.lineSeparator()).append(pet.getName()).append(" ").append(pet.getOwner());
        }

        return result.toString();
    }







}
