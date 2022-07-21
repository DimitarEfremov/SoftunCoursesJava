package Fundamentals.ObjectsandClasses.Excersise.OrderbyAge;

public class Person {
    private String name;
    private int idNumber;
    private int age;

    public Person (String name, int idNumber, int age){
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
