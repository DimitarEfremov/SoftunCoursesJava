package Advanced.IteratorsandComparators.Excersise.StrategyPattern;

import java.util.Comparator;

public class PersonAgeComperator implements Comparator<PersonSP> {
    @Override
    public int compare(PersonSP o1, PersonSP o2) {

        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
