package Fundamentals.ObjectsandClasses.Excersise.Students;

public class Students {
    //poleta
    private String firstName;
    private String lastName;
    private double grade;

    //konstruktor

    public Students (String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    //metod


    public double getGrade() {
        return this.grade;
    }


    @Override
    public String toString(){
        return String.format("%s %s: %.2f",firstName,lastName,grade);
    }
}
