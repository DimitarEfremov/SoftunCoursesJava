package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = bufferedReader.readLine();

        long sum = 0;

        while (line != null){


            char[] chars = line.toCharArray();

            for (char aChar : chars) {
                sum += aChar;
            }


            line = bufferedReader.readLine();
        }

        bufferedReader.close();

        System.out.println(sum);
    }
}
