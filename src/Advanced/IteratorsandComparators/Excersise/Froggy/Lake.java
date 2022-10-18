package Advanced.IteratorsandComparators.Excersise.Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> lake;

    public Lake (Integer... elements){
        this.lake = List.of(elements);

    }

    @Override
    public Iterator<Integer> iterator() {
            return new froggy();
    }

    class froggy implements Iterator<Integer>{
        private int index = 0;
        private String round = "even";

        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            Integer element = lake.get(index);
            index += 2;
            if (index >= lake.size() && round.equals("even")){
                index = 1;
                round = "odd";
            }

            return element;

        }
    }
}
