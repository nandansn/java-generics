package inheritance.overriding.interface1;

public class Test {

    public static void main(String[] args) throws AccountException {
        SavingsAccount savingsAccount = new SavingsAccount(1234, 10000);
        System.out.println();

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);

        System.out.println(savingsAccount.getBalance());

        System.out.println("loan account details");

        LoanAccount loanAccount = new LoanAccount(123456, 10000);
        System.out.println(loanAccount.getBalance());

        loanAccount.deposit(100);
        loanAccount.withdraw(300);

        System.out.println(loanAccount.getBalance());


        AccountService savings = new SavingsAccount(123456, 100000);
        System.out.println(savings.getBalance());

       savings.withdraw(8000000);


        System.out.println(savings.getBalance());

    }
}
