package Advanced.IteratorsandComparators.Excersise.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements ) {
        this.elements = List.of(elements);
        currentIndex = 0;
    }


    public boolean hasNext(){
        return currentIndex <elements.size()-1;
    }

    public boolean move(){
        if (hasNext()){
            currentIndex++;
            return true;
        }
            return false;
    }

    public void print() {
        if (elements.size() == 0){
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println(elements.get(currentIndex));
        }
    }

    public void printAll (){
        String result = String.join(" ", elements);
        System.out.println(result);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
               return (index < elements.size());

            }

            @Override
            public String next() {
                return elements.get(index++);
            }
        };
    }
}
