package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path outputFile = Paths.get("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");
        Path inputFileOne = Paths.get("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt");
        Path inputFileTwo = Paths.get("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt");

        List<String> firstFileLines = Files.readAllLines(inputFileOne);
        List<String> secondFileLines = Files.readAllLines(inputFileTwo);

        Files.write(outputFile,firstFileLines, StandardOpenOption.APPEND);
        Files.write(outputFile,secondFileLines, StandardOpenOption.APPEND);


    }
}
