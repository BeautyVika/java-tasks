package Task1;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
public class Student implements Comparable<Student>  {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    final int  MIN_MARK = 3;
    
    public void getScholarship() {
        if(averageMark >= MIN_MARK){
            if (averageMark == 5) {
                System.out.println("Стипендия у " + getFirstName() + " " + 2000);
            } else {
                System.out.println("Стипендия у " + getFirstName() + " " + 1900);
            }
        }else {
            System.out.println("Стипендия у " + getFirstName() + " " + 0);
        }
    }

    public void printInfo() {
        System.out.println("Фамилия и имя студента: " + firstName + lastName + " группа: " + group
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
