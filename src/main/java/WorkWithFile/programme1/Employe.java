package WorkWithFile.programme1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@AllArgsConstructor
public class Employe implements Serializable {
    private String name;
    private String department;
    private double salary;
    private int age;

}
