package inheritance.overriding.concrete;

public class Account {

    private double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public static void getName() {
        System.out.println("HDFC Account");
    }

}
