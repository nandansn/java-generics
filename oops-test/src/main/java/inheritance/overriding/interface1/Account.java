package inheritance.overriding.interface1;

public class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}
