package Task2;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Employee name: " + name + " salary: " + salary);
    }
}
