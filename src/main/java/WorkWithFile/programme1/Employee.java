package WorkWithFile.programme1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@AllArgsConstructor
public class Employee implements Serializable {
    static final long serailVersionUID = 2;
    private String name;
    private String surname;
    private String department;
    transient double salary;
//    private int age;

}
