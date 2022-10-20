package Advanced.IteratorsandComparators.Excersise.StackIterator;

import java.util.Iterator;
import java.util.Stack;

public class StackCustom implements Iterable<Integer> {

    Stack<Integer> elements;

    public StackCustom() {
        elements = new Stack<>();
    }

    public void push (int numb){
        this.elements.push(numb);

    }

    public void pop(){
        this.elements.pop();
    }

    public int size(){
        return elements.size();
    }

    public Stack<Integer> getElements() {
        return elements;
    }

    public void setElements(Stack<Integer> elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int index = elements.size()-1;

            @Override
            public boolean hasNext() {

                return index >=0 ;


            }

            @Override
            public Integer next() {
                return elements.get(index--);
            }
        };
    }
}
