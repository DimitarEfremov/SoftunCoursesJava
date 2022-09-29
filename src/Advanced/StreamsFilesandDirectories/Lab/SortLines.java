package Advanced.StreamsFilesandDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String address = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        Path path = Paths.get(address);

        List<String> lines = Files.lines(path).sorted().collect(Collectors.toList());


        Files.write(Paths.get("Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/06.SortLinesOutput.txt"),lines);
    }
}
