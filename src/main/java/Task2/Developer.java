package Task2;

public class Developer extends Employee{
    private String level;
    public Developer(String name, int salary, String level) {
        super(name, salary);
        this.level = level;
    }

    public void develop() {
        System.out.println("Developer " + level + " is writting code");
    }
}
