package Task6;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public void getInterest() {
        double interest = getBalance() * interestRate;
        System.out.println("Получены проценты: " + interest);
    }
}
