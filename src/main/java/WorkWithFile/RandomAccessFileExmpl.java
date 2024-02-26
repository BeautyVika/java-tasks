package WorkWithFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExmpl {
    public static void main (String[] args) throws FileNotFoundException {
        try(RandomAccessFile file = new RandomAccessFile("text2.txt", "rw")){
            int a  = file.read();
            System.out.println((char)a);

            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(103);
            String s2 = file.readLine();
            System.out.println(s2);

           long position = file.getFilePointer();
           System.out.println(position);

//           file.seek(0);
//           file.writeBytes("Hello");

            file.seek(file.length() -1);
            file.writeBytes("\nHello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
