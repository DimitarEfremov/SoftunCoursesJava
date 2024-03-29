package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();

        while (line != null){

            long sum = 0;

            char[] chars = line.toCharArray();

            for (char aChar : chars) {
                sum += aChar;
            }

            System.out.println(sum);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
