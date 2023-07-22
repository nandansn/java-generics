package inheritance.overriding.interface1;

public interface AccountService {

     public void deposit(double amount);

     public void withdraw(double amount) throws AccountException;

     public double getBalance();

}
