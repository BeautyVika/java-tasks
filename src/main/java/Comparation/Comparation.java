package Comparation;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparation {
    public static void main (String[] args){
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Bob", "Tomson", 1200);
        Employee emp2 = new Employee(3, "Tob", "Tomson", 2200);
        Employee emp3 = new Employee(2, "Nob", "Tomson", 1500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}

@Getter
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return this.id - o.id;
//        return this.name.compareTo(o.name);
//        return this.salary-o.salary;

//        if(this.salary == o.salary){
//            return 0;
//        }else if(this.salary < o.salary) {
//            return -1;
//        }else {
//            return 1;
//        }
    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}