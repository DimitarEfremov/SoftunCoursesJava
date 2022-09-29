package Advanced.StreamsFilesandDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));

        PrintWriter output = new PrintWriter(new FileWriter("output2.txt"));

        int counter = 1;

        String line = input.readLine();

        while (line != null){

            if (counter%3 == 0){
                output.println(line);
            }
            counter++;
            line = input.readLine();
        }


    }
}
