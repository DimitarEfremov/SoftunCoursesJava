package Advanced.StreamsFilesandDirectories.Lab;

import java.io.File;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) {

        String address = "Resources/04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams";

        File root = new File(address);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        int counter = 0;

        while (!queue.isEmpty()){

            File file = queue.poll();


            if (file.isDirectory()){
                System.out.print(file.getName());
                System.out.println();
                counter++;
            }

            File[] listOfFiles =  file.listFiles();


            if (listOfFiles != null){

                for (File f : listOfFiles) {
                    queue.offer(f);
                }
            }



        }

        System.out.printf("%d folders",counter);


    }
}
