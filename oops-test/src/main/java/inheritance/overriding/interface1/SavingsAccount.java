package inheritance.overriding.interface1;

public class SavingsAccount implements AccountService  {

    private Account account;

    public SavingsAccount(int accountNumber, double balance) {
        account = new Account(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double currentBalance = account.getBalance() + amount;
        account.setBalance(currentBalance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        double currentBalance = account.getBalance()  - amount;
        if (currentBalance < 0) {
            throw new InsufficientBalanceException();
        } else {
            account.setBalance(currentBalance);
        }

    }

    @Override
    public double getBalance() {
        return account.getBalance();
    }


}
