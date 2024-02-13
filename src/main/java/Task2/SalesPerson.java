package Task2;

public class SalesPerson extends Employee{
    private int revenue;
    public SalesPerson(String name, int salary, int revenue) {
        super(name, salary);
        this.revenue = revenue;
    }

    public void sale() {
        System.out.println("Sales Person with of " + revenue + "$ per month" + " sales");
    }
}
