package LambdaExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
