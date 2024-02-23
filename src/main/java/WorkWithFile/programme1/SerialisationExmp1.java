package WorkWithFile.programme1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialisationExmp1 {
    public static void main (String[] args) throws FileNotFoundException {
        List<String> employee = new ArrayList<>();
        employee.add("Elena");
        employee.add("Ivan");
        employee.add("Andrew");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees.bin")
        )) {
            outputStream.writeObject(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
