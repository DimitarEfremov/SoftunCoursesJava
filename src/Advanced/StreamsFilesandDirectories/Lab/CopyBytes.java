package Advanced.StreamsFilesandDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("output.txt");


        int readBytes = fileInputStream.read();

        while (readBytes>0){


            String digits = String.valueOf(readBytes);

            int charAsciiCode = Integer.parseInt(digits);

            if (charAsciiCode == 32 || charAsciiCode == 10){
                outputStream.write((char)charAsciiCode);
            } else {

                for (int i = 0; i <digits.length() ; i++) {
                    outputStream.write(digits.charAt(i));
                }
            }


            readBytes= fileInputStream.read();
        }

    }
}
