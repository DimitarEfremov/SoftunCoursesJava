package Advanced.StreamsFilesandDirectories.Excersise.SerializeCustomObject;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course();

        course.name = "Java Advanced";
        course.numberOfStudents = 250;

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/courses.ser"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources/courses.ser"));

        outputStream.writeObject(course);

        Course courseFromFile = (Course) inputStream.readObject();
        System.out.println(courseFromFile.name);
        System.out.println(courseFromFile.numberOfStudents);
    }
}
