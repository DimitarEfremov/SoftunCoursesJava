package Advanced.StreamsFilesandDirectories.Lab;

import java.io.File;

public class ListOfFiles {

    public static void main(String[] args) {

        String root = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams";

        File file = new File(root);


        File[] listOfFiles = file.listFiles();

        if (listOfFiles != null) {
            for (File f : listOfFiles) {
                if (!f.isDirectory()){
                    System.out.printf("%s: [%d]%n",f.getName(), f.length());
                }
            }
        }
    }
}
