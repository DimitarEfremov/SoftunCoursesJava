package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        BufferedWriter writer = new BufferedWriter(new FileWriter("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"));

        String line = reader.readLine();

        int counter = 1;

        while (line != null){

            String formattedLine = String.format("%d. %s",counter++,line);

            writer.write(formattedLine);
            writer.newLine();


            line = reader.readLine();
        }

        reader.close();
        writer.close();
    }
}
