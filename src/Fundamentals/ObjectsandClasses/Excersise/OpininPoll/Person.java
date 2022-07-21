package Fundamentals.ObjectsandClasses.Excersise.OpininPoll;

public class Person {
    //poleta
    private String name;
    private int age;
    //konstruktor

    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    //metodi

    public String getName () {
        return this.name;
    }
    public int getAge () {
        return this.age;
    }
}
