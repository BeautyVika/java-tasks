package Task1;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student>  {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    private final int  MIN_MARK = 3;

    public double getScholarship() {
        if(averageMark >= MIN_MARK){
            if (averageMark == 5) {
                return 2000;
            } else {
               return 1900;
            }
        }else {
            return 0;
        }
    }

    public void printInfo() {
        System.out.println("Фамилия и имя студента: " + firstName + " " + lastName + " группа: " + group
                           + " средняя оценка " + averageMark);
    }

    @Override
    public int compareTo(Student o) {
        if (this.averageMark > o.averageMark) {
            return 1;
        } else if (this.averageMark < o.averageMark) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void sortStudents(Student[] students) {
        Arrays.sort(students);
    }
}
