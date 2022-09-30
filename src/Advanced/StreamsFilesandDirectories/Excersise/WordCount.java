package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {

        String wordsPath = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt";

        String textPath = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt";

        String outputFilePath = "Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt";


        Scanner wordScanner = new Scanner(new FileReader(wordsPath));

        Scanner textScanner = new Scanner(new FileReader(textPath));

        PrintWriter printWriter = new PrintWriter(outputFilePath);


        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();


        String[] wordsToUSeArr = wordScanner.nextLine().split(" ");

        for (String s : wordsToUSeArr) {
            wordsMap.put(s,0);
        }

        String singleWord = textScanner.next();

        while (textScanner.hasNextLine()){

            if (wordsMap.containsKey(singleWord)){
                wordsMap.put(singleWord,wordsMap.get(singleWord) + 1);
            }


             singleWord = textScanner.next();
        }

        for (String s : wordsMap.keySet()) {
            printWriter.printf("%s - %d%n",s, wordsMap.get(s));
        }

        textScanner.close();
        wordScanner.close();
        printWriter.close();
    }
}
