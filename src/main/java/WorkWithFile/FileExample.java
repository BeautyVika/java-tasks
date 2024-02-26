package WorkWithFile;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main (String[] args) throws IOException {
        File file = new File("text2.txt");
        File file2 = new File("text3.txt");
        File folder = new File("C:\\Users\\pyatukhova\\Desktop\\test.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());

        System.out.println(folder.isAbsolute());
        System.out.println(file.isDirectory());
        System.out.println("file2 is directory " + file2.isDirectory());

        System.out.println(file2.exists());
        System.out.println(file2.mkdir());
        System.out.println(file2.length());
        System.out.println(file2.listFiles());
//        System.out.println(file2.delete());
    }
}
