package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ALLCAPITALS {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        FileReader fileReader = new FileReader(path);

        Scanner scanner = new Scanner(fileReader);

        String outputFilePath = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";

        PrintWriter pw = new PrintWriter(outputFilePath);



        while (scanner.hasNextLine()){

            String  line = scanner.nextLine();

            pw.println(line.toUpperCase());


        }

        scanner.close();
        pw.close();

    }
}
