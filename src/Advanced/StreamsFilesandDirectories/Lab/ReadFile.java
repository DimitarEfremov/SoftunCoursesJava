package Advanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {


        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

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
