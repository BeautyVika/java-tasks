package Task2;

public class Manager extends Employee{
    private int successContract;
    public Manager(String name, int salary, int successContract) {
        super(name, salary);
        this.successContract = successContract;
    }

    public void work() {
        System.out.println("Manager with " + successContract + " contracts per month works");
    }
}
