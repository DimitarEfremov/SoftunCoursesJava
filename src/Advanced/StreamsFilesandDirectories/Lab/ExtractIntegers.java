package Advanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(inputStream);

        String outputPath = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/04.ExtractIntegersOutput.txt";

        FileOutputStream outputStream = new FileOutputStream(outputPath);

        PrintWriter printWriter = new PrintWriter(outputStream);

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int line = scanner.nextInt();
                printWriter.println(line);
            }
            scanner.next();


        }

        scanner.close();
        printWriter.close();

    }
}
