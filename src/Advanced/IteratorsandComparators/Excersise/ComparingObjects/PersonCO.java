package Advanced.IteratorsandComparators.Excersise.ComparingObjects;

public class PersonCO implements Comparable<PersonCO>  {

    private String name;
    private int age;
    private String city;

    public PersonCO(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(PersonCO otherP) {

        if (this.name.equals(otherP.getName())){
            if (this.age == otherP.getAge()){
                return this.getCity().compareTo(otherP.getCity());
            } else {
                return this.getAge() - otherP.getAge();
            }
        }
        return this.getName().compareTo(otherP.getName());
    }
}
