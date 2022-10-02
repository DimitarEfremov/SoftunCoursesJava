package Advanced.StreamsFilesandDirectories.Excersise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyaPicture {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\dimit\\Desktop\\За Ленчу\\Nb6Lln.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\dimit\\Desktop\\За Ленчу\\copy.jpg");

        byte[] buffer = new byte[1024];

        while (fis.read(buffer) >= 0){
            fos.write(buffer);
        }

        fis.close();
        fos.close();

    }
}
