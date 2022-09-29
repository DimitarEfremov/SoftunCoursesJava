package Advanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WritetoFile {

    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/02.WriteToFileOutput.txt");

        Set<Character> chars = Set.of (',', '.', '!', '?');

        int readBytes = fileInputStream.read();

        while (readBytes>0){

            char symbol = (char) readBytes;

            if (!chars.contains(symbol)){
                outputStream.write(symbol);
            }


            readBytes= fileInputStream.read();
        }



    }
}
