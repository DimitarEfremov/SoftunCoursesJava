package Advanced.IteratorsandComparators.Excersise.StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<PersonSP> {
    @Override
    public int compare(PersonSP personOne, PersonSP personTwo) {

        if (personOne.getName().length() == personTwo.getName().length()){
            char startOfFirstName = personOne.getName().toLowerCase().charAt(0);
            char startOfSecondName = personTwo.getName().toLowerCase().charAt(0);
            return Character.compare(startOfFirstName, startOfSecondName);

        }
        return personOne.getName().length() - personTwo.getName().length();
    }
}
