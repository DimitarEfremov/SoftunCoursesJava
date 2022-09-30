package Advanced.StreamsFilesandDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));

        FileOutputStream fileOutputStreamStream = new FileOutputStream("Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/05.WriteEveryThirdLineOutput.txt");

        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(fileOutputStreamStream));

        int counter = 1;

        String line = input.readLine();

        while (line != null){

            if (counter %3 == 0){
                output.write(line);
                output.newLine();

            }


            counter++;
            line = input.readLine();
        }

        input.close();
        output.flush();
        output.close();

    }
}
