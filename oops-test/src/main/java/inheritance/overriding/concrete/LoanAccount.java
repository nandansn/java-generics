package inheritance.overriding.concrete;

public class LoanAccount extends Account {


    public LoanAccount(double amount, int accountNumber) {
        super(amount * -1,accountNumber);
    }

    @Override
    public void deposit(double amount) {

        super.deposit(amount);
    }


    public static void getName() {
        System.out.println("HDFC Loan Account");
    }
}
