package Advanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {


        String path = "https://github.com/DimitarEfremov/SoftunCoursesJava/blob/17ba503a862a738c793b1da4c483f8ee4a5a4f12/Resources/04.%20Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path) ){

            int oneByte = fileInputStream.read();

            while (oneByte> 0){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
