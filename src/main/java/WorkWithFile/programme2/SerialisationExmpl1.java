package WorkWithFile.programme2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;;
import java.util.ArrayList;
import java.util.List;

public class SerialisationExmpl1 {
    public static void main (String[] args) throws FileNotFoundException {
        List<String> employee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees.bin"))) {
            employee = (ArrayList)inputStream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
