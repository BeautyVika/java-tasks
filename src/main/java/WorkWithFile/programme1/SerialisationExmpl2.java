package WorkWithFile.programme1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationExmpl2 {
    public static void main (String[] args) throws FileNotFoundException {
        Employee employee = new Employee("Maria", "Ivanova","it", 500);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
