package Advanced.DefiningClasses.Excersises.OpinionPoll;

public class PersonPoll {

    private String name;
    private int age;

    public PersonPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getNameAgeInfo() {
        return String.format("%s - %d",name,age);
    }
}
