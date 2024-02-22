package HashCodeExample;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample {
    public static void main (String[] args){
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Kate", "Ivanova", 4);
        Student st2 = new Student("Tom", "Sidorov", 1);
        Student st3 = new Student("Andrew", "Petrov", 2);

        Student str4 = new Student("Andrew", "Petrov", 2);

        map.put(st1, 7.5);
        map.put(st2, 8.5);
        map.put(st3, 9.3);

        System.out.println(map);
        System.out.println(map.containsKey(str4));
    }
}

@Getter
class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}