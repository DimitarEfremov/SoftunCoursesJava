package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.File;
import java.util.ArrayDeque;

public class GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("Resources/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");
        ArrayDeque<File> directories = new ArrayDeque<>();

        directories.offer(folder);

        int sumOfBites = 0;

        while (!directories.isEmpty()) {

            File fileToWorkWith = directories.poll();
            File[] files = fileToWorkWith.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    directories.offer(file);
                } else {
                    sumOfBites += fileToWorkWith.length();
                }

            }


        }

        System.out.println(sumOfBites);
    }
}
