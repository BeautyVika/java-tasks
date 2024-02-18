package jsp_start;

import Task1.Aspirant;
import Task1.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void getAllStudents() {
        Student student = new Student("Harry", "Potter", "Group 1", 4.6);
        Aspirant aspirant = new Aspirant("Germiona", "Grenjer", "Group 5",
                5.0, "ScienceWork");
        Student[] expected = {aspirant, student};

        Student[] actual = new Student[2];
        actual[0] = aspirant;
        actual[1] = student;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetScholarshipForStudent() {
        Student student = new Student("Иван", "Иванов", "Группа 1", 4.8);
        double expected = 1900;

        double actual = student.getScholarship();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGetScholarshipForAspirant() {
        Aspirant aspirant = new Aspirant("Петр", "Петров", "Группа 2", 3.5, "Научная работа 1");
        double expected = 2200;

        double actual = aspirant.getScholarship();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCompareTo() {
        Student student = new Student("Иван", "Иванов", "Группа 1", 4.8);
        Aspirant aspirant = new Aspirant("Петр", "Петров", "Группа 2", 3.5, "Научная работа 1");

        int expected = 1;
        int actual = student.compareTo(aspirant);

        Assert.assertEquals(expected, actual);
    }
}
