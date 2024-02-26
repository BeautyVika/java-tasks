package WorkWithFile.programme2;

import WorkWithFile.programme1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialisationExmpl2 {
    public static void main (String[] args) {
        Employee bestEmployee;

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))){
           bestEmployee = (Employee) inputStream.readObject();
           System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
