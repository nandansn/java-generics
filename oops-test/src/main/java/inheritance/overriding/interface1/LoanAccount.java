package inheritance.overriding.interface1;

public class LoanAccount implements AccountService {

    private Account account;


    public LoanAccount(int accountNumber, double amount) {

        account = new Account(accountNumber, amount);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }
}
