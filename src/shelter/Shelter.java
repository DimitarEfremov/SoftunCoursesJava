package shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shelter {

    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();

    }

    public void add(Animal animal) {

        if (data.size() < capacity) {
            this.data.add(animal);
        }

    }

    public boolean remove(String name) {

        return data.removeIf(a -> a.getName().equals(name));

    }

    public Animal getAnimal(String name, String caretaker) {

        for (Animal animal : data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }


    public Animal getOldestAnimal(){
        return Collections.max(data, Comparator.comparingInt(Animal::getAge));

    }

    public int getCount(){
        return data.size();
    }

    public String getStatistics(){

        StringBuilder result = new StringBuilder();
        result.append("The shelter has the following animals:");

        for (Animal animal : data) {
            result.append(System.lineSeparator()).append(animal.getName()).append(" ").append(animal.getCaretaker());
        }
            return result.toString();
    }

}
