package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        int vowels = 0;
        int consonants = 0;
        int punctuation  = 0;

        FileReader fileReader = new FileReader(path);

        FileWriter fileWriter = new FileWriter("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt");


        int oneByte = fileReader.read();

        while (oneByte >= 0){


              if (isVowel(oneByte)){
                  vowels++;
              } else if (isPunctuation(oneByte) ){
                  punctuation++;
              } else if (!Character.isWhitespace(oneByte)){
                  consonants++;
            }

            oneByte = fileReader.read();
        }

        fileWriter.write("Vowels: " + vowels);
        fileWriter.write("\n");
        fileWriter.write("Consonants: " + consonants);
        fileWriter.write("\n");
        fileWriter.write("Punctuation: " + punctuation);

        fileReader.close();
        fileWriter.close();

    }

    private static boolean isPunctuation(int ch) {
        return   ch == '!' || ch == ',' || ch == '.' || ch == '?';
    }

    private static boolean isVowel(int ch) {

      return   ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
