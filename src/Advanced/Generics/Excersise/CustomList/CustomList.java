package Advanced.Generics.Excersise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> values;

    public CustomList() {
        values = new ArrayList<>();
    }

    public int size(){
        return values.size();
    }

    public T get (int index){
        return values.get(index);
    }

    public void add(T element) {
        values.add(element);

    }

    public T remove(int index) {
        return values.remove(index);
    }

    public boolean contains(T element) {
        return values.contains(element);
    }

    public void swap(int first, int second) {

        if (first >= 0 && second < values.size()) {
            Collections.swap(values, first, second);
        }
    }

    public int elementsBiggerThan(T elementFromBox){
        return Math.toIntExact(values.stream().filter(e -> e.compareTo(elementFromBox) > 0).count());

    }

    public T getMax(){
        return values.stream().max(Comparable::compareTo).get();

    }

    public T getMin(){
        return values.stream().min(Comparable::compareTo).get();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T value : values) {
            sb.append(value).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
