package Task1;
import java.util.Arrays;

public class Student implements Comparable<Student>  {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    final int  MIN_MARK = 3;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

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