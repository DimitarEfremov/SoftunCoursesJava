package Advanced.Generics.Excersise.GenericBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoxGB<T extends Comparable<T> > {
    private List<T> values;


    public BoxGB() {
        this.values = new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    public int elementsBiggerThan(T elementFromBox){
       return Math.toIntExact(values.stream().filter(e -> e.compareTo(elementFromBox) > 0).count());

    }

    public void swap (int first, int second){

        if (first >= 0 && second < values.size()){

     //    Collections.swap(values,first,second);

            T element1 = values.get(first);

            values.set(first,values.get(second));
            values.set(second,element1);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T value : values) {
            sb.append(String.format("%s: %s%n",value.getClass().getName(),value.toString()));
        }
        return sb.toString();
    }

}
